//max of three number using this pointer
#include<iostream.h>
#include<conio.h>
class max{
	int num;
	public:
		max(int n){
			num = n;
		}
		max & max :: check(max &a, max &b){
			if(a.num >= b.num && a.num >= num)
				return a;
			else if(b.num >= a.num && b.num >= num)
				return b;
			else
				return *this;
		}
		void display(){
			cout<<"max is "<<num<<endl;
		}
};
void main(){
	clrscr();
	max m1(5), m2(3), m3(7);
	max m = m1.check(m2,m3);
	m.display();
	getch();
}