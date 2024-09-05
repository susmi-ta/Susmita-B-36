//default arguments (maximum of numbers)
#include<iostream.h>
#include<conio.h>
class max{
	public:
		void maxof2(int a=3, int b=7);
		void maxof3(int a=3, int b=7, int c=9);
};

void max :: maxof2(int a,int b){
	if(a>b)
		cout<<"max is "<<a<<endl;
	else
		cout<<"max is "<<b<<endl;
}

void max :: maxof3(int a, int b, int c){
	if(a>b && a>c)
		cout<<"max is "<<a<<endl;
	else if(b>c && b>a)
		cout<<"max is "<<b<<endl;
	else
		cout<<"max is "<<c<<endl;
}

void main(){
	clrscr();
	max m;
	m.maxof2();
	m.maxof3();
	cout<<"after changing the values for a=8, b=2"<<endl;
	m.maxof2(8,2);
	m.maxof3(8,2);
	getch();
}


