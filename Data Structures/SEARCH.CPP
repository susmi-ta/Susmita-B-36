//binary search
#include<stdio.h>
#include<conio.h>
void main(){
	clrscr();
	int f=0,l,mid,k,a[20],n,i;
	printf("enter total number of element:- ");
	scanf("%d",&n);
	printf("enter the array element:- ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	printf("enter the searching element:- ");
	scanf("%d",&k);
	l=n-1;
	mid= (f+l)/2;
	while(f<l && a[mid]!=k){
		if(a[mid]<k){
			f=mid+1;
		}
		else
			l=mid-1;
		mid=(f+l)/2;
	}
	if(a[mid]==k)
		printf("found");
	else
		printf("not found");
getch();
}




