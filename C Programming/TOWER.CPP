//tower of hanoi (using recursion)
#include<stdio.h>
#include<conio.h>
void tower(int n,char b,char a,char e){
	if(n==1){
		printf("%c->%c \n",b,e);
		return;
	}
	tower(n-1,b,e,a);
	printf("%c->%c \n",b,e);
	tower(n-1,a,b,e);
}
void main(){
	int n;
	clrscr();
	printf("enter the no. of disc:- ");
	scanf("%d",&n);
	tower(n,'A','B','C');
	getch();
}
