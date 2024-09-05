//merge sort:

#include<stdio.h>
#include<conio.h>
void main(){
	clrscr();
	int a[10],b[10],c[30],i,j,m,n,k,d;
	printf("\nenter total number of elements in 1st array:- ");
	scanf("%d",&n);
	printf("\nenter 1st array elements:- ");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("\nenter total number of elements in 2nd array:- ");
	scanf("%d",&m);
	printf("\nenter 2nd array elements:- ");
	for(j=0;j<m;j++)
		scanf("%d",&b[j]);

	a[n]=999;
	b[m]=999;
	d=n+m;
	i=0; j=0;
	for(k=0;k<d;k++){
		if(a[i]<b[j]){
			c[k]=a[i];
			i++;
		}
		else{
			c[k]=b[j];
			j++;
		}
	}
	printf("after sorting \n");
	for(k=0;k<d;k++){
		printf(" %d",c[k]);
	}
	getch();
}