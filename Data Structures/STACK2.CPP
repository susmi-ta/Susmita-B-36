//string palindrome using stack
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#define maxsize 20
int top = -1,n=0;
char stack[20],t[20];
void PUSH(char a){
	top=top+1;
	stack[top]=a;
}
void POP(){
	int i;
	for(i=0; i<n; i++){
		t[i]=stack[top];
		top=top-1;
	}
}
void main(){
	char a,b[20]; int i,f=0;
	clrscr();
	printf("enter a string:- ");
	gets(b);
	for(i=0 ;b[i]!='\0'; i++){
		n++;
		a=b[i];
		PUSH(a);
	}
	POP();
	for(i=0;i<n;i++){
		if(stack[i]!=t[i]){
			f=f+1;
		}
	}
	if(f>0)
		printf("not palindrome");
	else
		printf("palindrome");
	getch();
}