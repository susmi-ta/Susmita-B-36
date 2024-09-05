//insersion sort
#include<stdio.h>
#include<conio.h>
void main(){
	int a[20],i,k,temp,n,ptr;
	clrscr();
	printf("enter the no of array element:- ");
	scanf("%d",&n);
	printf("enter the array elements:- ");
	for(i=1;i<=n;i++){
		scanf("%d",&a[i]);

	}
	a[0]=-999;
	for(k=2;k<=n;k++){
		temp=a[k];
		ptr=k-1;
		while(temp < a[ptr]){
			a[ptr+1]=a[ptr];
			ptr=ptr-1;
		}
		a[ptr+1]=temp;
	}
	printf("After sorting by insertion sort: \n");
	for(i=1;i<=n;i++){
		printf("%d ",a[i]);
	}
getch();
}