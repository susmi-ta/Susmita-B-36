//Floyd-Warshal's all pair shortest path routing algorithm implementation using c programming.
#include<stdio.h>
#include<conio.h>
#define size 10
void floyd(int a[size][size],int n){
	int k,i,j;
	for(k=0;k<n;k++){
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(a[i][j]>(a[i][k]+a[k][j])){
					a[i][j]=(a[i][k]+a[k][j]);
				}
			}
		}
	}
}
void main(){
	int a[size][size];
	int i,j,n;
	clrscr();
	printf("Enter no. of vertices : ");
	scanf("%d",&n);
	printf("Give the initial weighted graph in weight matrix form(give 9999 in the place of infinity) : \n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	}
	printf("The input weight matrix is:-\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(a[i][j]==9999){
				printf(" inft");
			}
			else{
				printf("%5d",a[i][j]);
			}
		}
		printf("\n");
	}
	floyd(a,n);
	printf("\nThe final matrix where we can find the shortest distance:\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%5d",a[i][j]);
		}
		printf("\n");
	}
	getch();
}