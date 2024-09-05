//selection sort:
#include<stdio.h>
#include<conio.h>
void main(){
	clrscr();
	int a[20],i,j,c=0,p,r,n;
	printf("enter total number of elements:- ");
	scanf("%d",&n);
	printf("enter the array element:- ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		p=a[i];
		c=i;
		for(j=i+1;j<n;j++){
			if(p>a[j]){
				p=a[j];
				c=j;
			}
		}
		r=a[i];
		a[i]=a[c];
		a[c]=r;
	}
	printf("after sorting:- ");
	for(i=0;i<n;i++){
		printf(" %d",a[i]);
	}
	getch();
}




