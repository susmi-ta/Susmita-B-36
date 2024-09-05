//structure which will take integer,character, float variable
#include<stdio.h>
#include<conio.h>
struct abc{
	int a;
	float b;
	char c;
} p ;
void main(){
	clrscr();
	struct abc *t;
	printf("enter the character:- ");
	scanf("%c",&t->c);
	printf("enter integer:- ");
	scanf("%d",&t->a);
	printf("enter floating type integer:- ");
	scanf(" %f",&t->b);
	printf("structure variable are:- ");
	printf("%d %f %c",t->a,t->b,t->c);
	getch();

}
linkfloat(){
	float a=0,*b;
	b=&a;
	a=*b;
}