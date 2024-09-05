//prime number using c++
#include<iostream.h>
#include<conio.h>
class prime{
	public:
		void getdata(int n){
			int i,t=0;
			for(i=1; i<=n ; i++){
				if(n%i==0)
					t=t+1;
			}
		if(t==2)
			cout<<"prime number";
		else
			cout<<"it's not a prime number";
		}
};
void main(){
	prime p;
	int a;
	cout<<"Enter a number: ";
	cin>>a;
	p.getdata(a);
	getch();
}

