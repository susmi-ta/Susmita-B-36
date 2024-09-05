//HAMMING CODE(7 bit):
#include<iostream.h>
#include<conio.h>
void main(){
	clrscr();
	int a[10],b[10],c1,c2,c3,i;
	cout<<"enter 4 data bits one by one: \n";
	cin>>a[0]>>a[1]>>a[2]>>a[4];
	a[6]=a[0]^a[2]^a[4];
	a[5]=a[0]^a[1]^a[4];
	a[3]=a[0]^a[1]^a[2];
	cout<<"\nencoded data is: "<<endl;
	for(i=0;i<7;i++){
		cout<<a[i];
	}
	cout<<"\nenter data after changing of bit: "<<endl;
	for(i=0;i<7;i++){
		cin>>b[i];
	}
	c1=b[0]^b[2]^b[4]^b[6];
	c2=b[0]^b[1]^b[4]^b[5];
	c3=b[0]^b[1]^b[2]^b[3];
	int c=c3*4 + c2*2 + c1*1;
	cout<<"\nhamming code: "<<endl;
	for(i=0;i<7;i++){
		cout<<a[i];
	}
	cout<<"\ndata received: "<<endl;
	for(i=0; i<7;i++){
		cout<<b[i];
	}
	if(c==0)
		cout<<"\nthere is no error in the data";
	else{
		cout<<"\nthere is an error in position: "<<(8-c);
		cout<<"\nafter correction of data: "<<endl;
		if(b[7-c]==0){
			b[7-c]=1;
		}
		else{
			b[7-c]=0;
		}
		for(i=0;i<7;i++){
			cout<<b[i];
		}
	}
	getch();
}
