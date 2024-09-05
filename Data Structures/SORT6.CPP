//bubble sort:
#include<stdio.h>
#include<conio.h>
void main(){
	int a[20],i,n,j,b;
	clrscr();
	printf("enter total number of elements:- ");
	scanf("%d",&n);
	printf("enter array elements:- ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		for(j=0;j<n-i-1;j++){
			if(a[j] > a[j+1]){
				b=a[j];
				a[j]=a[j+1];
				a[j+1]=b;
			}
		}
	}
	printf("after sorting by bubble sort:-\n");
	for(i=0;i<n;i++)
		printf("%d ",a[i]);
	getch();
}