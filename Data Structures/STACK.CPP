//stack:-
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#define maxsize 20
int top = -1;
int stack[20];
void PUSH(int item){
	if(top==maxsize){
		printf("full");}
	else{
		top=top+1;
		stack[top]=item;
	}
}
void POP(){
	int t;
	if(top==-1){
		printf("empty");}
	else{
		t=stack[top];
		top=top-1;
		printf("the deleted element is %d\n",t);
	}
}
void display(){
	int i;
	for(i=0; i<=top; i++){
		printf(" %d ", stack[i]);
	}
}
void main(){
	int ch, item;
	clrscr();
	while(1){
		printf("\n 1. PUSH");
		printf("\n 2. POP");
		printf("\n 3. DISPLAY");
		printf("\n 4. EXIT");
		printf("\n Enter your choice:- ");
		scanf("%d",&ch);
		switch(ch){
			case 1:
				printf("enter a number:- ");
				scanf("%d",&item);
				PUSH(item);
				break;
			case 2:
				POP();
				break;
			case 3:
				display();
				break;
			case 4:
				exit(0);
			default:
				printf("wrong option");
		}
	}
	getch();
}

