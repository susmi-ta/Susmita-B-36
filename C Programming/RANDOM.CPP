//program to print any random number
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
void main(){
	int i;
	clrscr();
	srand (time(0));   //time 0 ms
	int a=rand();
	printf("%d \n",a);
	getch();

}




