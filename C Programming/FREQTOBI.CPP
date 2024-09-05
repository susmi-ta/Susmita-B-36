//enter a string, ten count a=1, b=2,..., y=25,z=26. then convert it into decimal no. then convert it into binary
//ex: input= abc, 123, binary
#include<stdio.h>
#include<conio.h>
void main(){
	int p=0,i,r=0,s=1,n,t=0,b,j=1,d[40],f=0;
	char a[20];
	clrscr();
	printf("enter the string:- ");
	gets(a);
	for(i=0;a[i]!='\0'; i++){
		p=(int)a[i]-96;
		n=p;
		while(p>0){
			p=p/10;
			s=s*10;
		}
		r=r*s+n;
		s=1;
	}
	printf("decimal number of string is %d",r);
	while(r>0){
		b=r%2;
		r=r/2;
	      //t=t+b*j;
	      //j=j*10;
		d[f]=b;
		f=f+1;
	}
	printf("\n binary number of string is:- ");
	for(i=f-1;i>=0;i--){
		printf("%d",d[i]);
	}
	getch();
}