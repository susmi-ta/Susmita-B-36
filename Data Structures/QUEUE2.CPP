//circular queue
#include <stdio.h>
#include <stdlib.h>
#include<conio.h>
#define maxsize 10
int r = -1;
int f = -1;
int cqueue[10];

void rare(int item){
	if ( (r==maxsize-1)&&(f==0)||(r==(f-1)) ){
		printf("\n queue full ");
	}
	else{
		r=(r+1)%maxsize;
		cqueue[r] = item;
		if(f==-1)
			f=0;
	}
}
void front(){
	if (f==-1)
		printf("queue empty");
	else{
		printf("the deleted element is %d",cqueue[f]);
		if(f==r){
			f=-1;
			r=-1;
		}
		else
			f=(f+1)%maxsize;
	}
}
void display(){
	int i;
	if(f<=r){
		for (i = f; i <= r; i++){
			printf("%d\t", cqueue[i]);
		}
	}
	else{
		for(i=f;i<=maxsize-1;i++)
			printf("%d\t", cqueue[i]);
		for(i=0;i<=r;i++)
			printf("%d\t", cqueue[i]);
	}
}

int main(){
	int ch, item;
	clrscr();
	while (1){
		printf("\n1.Rear  ");
		printf("\n2.Front  ");
		printf("\n3.Display  ");
		printf("\n4.exit  ");
		printf("\nenter your choice ");
		scanf("%d", &ch);
		switch (ch){
			case 1:
				printf("enter a number:- ");
				scanf("%d",&item);
				rare(item);
				break;
			case 2:
				front();
				break;
			case 3:
				display();
				break;
			case 4:
				exit(0);
				break;
			default:
				printf("wrong option\n");
				break;
		}
	}
	return 0;
	getch();
}