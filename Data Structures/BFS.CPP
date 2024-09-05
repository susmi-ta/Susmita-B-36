//implementation of BFS using c:
#include<stdio.h>
#include<stdlib.h>
struct queue
{
    int size;
    int f;
    int r;
    int* arr;
};


int isEmpty(struct queue *q){
    if(q->r==q->f){
	return 1;
    }
    return 0;
}

int isFull(struct queue *q){
    if(q->r==q->size-1){
	return 1;
    }
    return 0;
}

void enqueue(struct queue *q, int val){
    if(isFull(q)){
	printf("This Queue is full\n");
    }
    else{
	q->r++;
	q->arr[q->r] = val;
    }
}

int dequeue(struct queue *q){
    int a = -1;
    if(isEmpty(q)){
	printf("This Queue is empty\n");
    }
    else{
	q->f++;
	a = q->arr[q->f];
    }
    return a;
}

int main(){
    clrscr();
    struct queue q;
    q.size = 400;
    q.f = q.r = 0;
    q.arr = (int*) malloc(q.size*sizeof(int));


    int node,i,k,l,visited[10],a[10][10],n;
    printf("enter total number of vertex: ");
    scanf("%d",&n);
    for(k=0;k<n;k++)
        visited[k]=0;
    printf("enter adjacent matrix:\n");
    for(k=0;k<n;k++){
	for(l=0;l<n;l++){
	    scanf("%d",&a[k][l]);
	}
    }
    printf("enter starting vertex: ");
    scanf("%d",&i);
    printf("BFS traversal=\n");
    printf("%d ", i);
    visited[i] = 1;
    enqueue(&q, i);
    while (!isEmpty(&q)){
	int node = dequeue(&q);
  	for (int j = 0; j < n; j++){
      		if(a[node][j] ==1 && visited[j] == 0){
    			printf("%d ", j);
    			visited[j] = 1;
    			enqueue(&q, j);
      		}
  	}
    }
    getch();
    return 0;
}