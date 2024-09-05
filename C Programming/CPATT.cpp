//pattern using c++
#include<iostream.h>
#include<conio.h>
class pattern{
	int i,j;
	public:
		void getdata(int n){
			for(i=1; i<=n; i++){
				for(j=1; j<=i; j++){
					cout<<i;
				}
				cout<<endl;
			}
		}
};
void main(){
	clrscr();
	pattern p;
	int a;
	cout<<"enter number of rows: ";
	cin>>a;
	p.getdata(a);
	getch();
}