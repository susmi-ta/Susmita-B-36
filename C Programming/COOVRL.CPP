//multiplication of two complex number (operator overloading)
#include<iostream.h>
#include<conio.h>
class complex{
	float x;
	float y;
	public:
		complex(){}
		complex(float real, float imag){
			x=real;
			y=imag;
		}
		complex operator*(complex);
		void display(){
			cout<<x<<" * j "<<y<<endl;
		}

};
complex complex :: operator*(complex c){
	complex temp;
	temp.x = (x * c.x) + (x * c.y);
	temp.y = (y * c.y) + (y * c.x);
	return(temp);
}
void main(){
	clrscr();
	complex c1,c2,c3;
	c1= complex(1.5, 2.5);
	c2= complex(2.3, 4.5);
	c3= c1*c2;
	cout<< "c1= "; c1.display();
	cout<< "c2= "; c2.display();
	cout<< "c3= "; c3.display();
	getch();
}


