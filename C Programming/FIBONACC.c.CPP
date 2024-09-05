#include<stdio.h>
#include<conio.h>
void fibo(int n,int a,int b){
	int c,i;
	for(i=3;i<=n;i++){
		c=a+b;
		a=b;
		b=c;
		printf(" %d",c);
	}
}
void main(){
	clrscr();
	int a=0,b=1,n;
	printf("enter nth term:- ");
	scanf("%d",&n);
	printf("result = %d %d",a,b);
	fibo(n,a,b);
	getch();
}
