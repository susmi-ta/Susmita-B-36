//single inheritance:
#include<iostream.h>
#include<conio.h>
class a{
	public:
		void display(){
			cout<<"hi.. "<<endl;
		}
};
class b : public a{
	public:
		void display1(){
			cout<<"hello.."<<endl;
		}
};
void main(){
	clrscr();
	b B;
	B.display();
	B.display1();
	getch();
}