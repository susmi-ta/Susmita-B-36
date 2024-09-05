//implementation of dfs using c:
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int visited[10],a[10][10],total;
void DFS(int i){
    printf("%d ", i);
    visited[i] = 1;
    for (int j = 0; j < total; j++)
    {
	if(a[i][j]==1 && !visited[j]){
	    DFS(j);
	}
    }
}

int main(){
    clrscr();
    int n,j,k;
    printf("enter the total number of vertices: ");
    scanf("%d",&total);
    for(j=0;j<total;j++){
	visited[j]=0;
    }
    printf("\n enter the adjacency matrix:\n");
    for(j=0;j<total;j++){
	for(k=0;k<total;k++){
		scanf("%d",&a[j][k]);
	}
    }
    printf("enter starting vertex: ");
    scanf("%d",&n);
    DFS(n);
    getch();
    return 0;
}
