//multilevel inheritance:
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
class c : public b{
	public:
		void display2(){
			cout<<"hola!.."<<endl;
		}
};
void main(){
	clrscr();
	c C;
	C.display();
	C.display1();
	C.display2();
	getch();
}