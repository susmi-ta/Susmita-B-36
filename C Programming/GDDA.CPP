//DDA line drawing algorithm:
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
void main(){
	clrscr();
	int gd=DETECT, gm;
	initgraph(&gd, &gm, "c:\\turboc3\\bgi");
	int x,y,x1,y1,x2,y2,i=0;
	printf("Enter the starting point x1 & y1: \n");
	scanf("%d%d", &x1,&y1);
	printf("Enter the end point x2 & y2: \n");
	scanf("%d%d", &x2, &y2);
	int dx= x2-x1;
	int dy= y2-y1;
	int steps = 0;
	if(abs(dx) >= abs(dy)){
		steps = dx;
	}
	else{
		steps = dy;
	}
	float xn = dx/steps;
	float yn = dy/steps;
	x=x1;
	y=y1;
	while(i <= steps){
		putpixel(x,y,3);
		x = x + xn;
		y = y + yn;
		i++;
	}
	getch();
	closegraph();
}