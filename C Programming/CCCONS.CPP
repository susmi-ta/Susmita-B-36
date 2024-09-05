//to copy name, add, marks of one constructor to another constructor using copy constructor
#include<iostream.h>
#include<conio.h>
#include<string.h>
class info{
	char name[15],add[30];
	int marks;
	public:
		info(char n[], char m[],int o){
			strcpy(name,n);
			strcpy(add,m);
			marks=o;
		}
		info( info & x){
			strcpy(name,x.name);
			strcpy(add,x.add);
			marks=x.marks;
		}
		void display(){
			cout<<"name: "<<name<<"\naddress: "<<add<<"\nmarks: "<<marks<<endl;
		}
};
void main(){
	clrscr();
	char x[15],y[30]; int z;
	cout<<"Enter name: ";
	cin>>x;
	cout<<"Enter address: ";
	cin>>y;
	cout<<"Enter marks: ";
	cin>>z;
	info i1(x,y,z);
	info i2(i1);
	cout<<"\nobject i1:- "<<endl;
	i1.display();
	cout<<"\nobject i2:- "<<endl;
	i2.display();
	getch();
}