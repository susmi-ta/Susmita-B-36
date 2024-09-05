//add,sub,mul of complex number using friend operator and switch case
#include<iostream.h>
#include<conio.h>
class complex{
	float  r,i;
	public:
		void input(float real, float imag){
			r=real;
			i=imag;
		}
		friend complex add(complex, complex);
		friend complex sub(complex, complex);
		friend complex mul(complex, complex);
		void display(complex c3){
			if(c3.i < 0)
				cout<<c3.r<<c3.i<<"i"<<endl;
			else
				cout<<c3.r<<"+"<<c3.i<<"i"<<endl;
		}
};
complex add(complex c1, complex c2){
	complex temp;
	temp.r = c1.r + c2.r;
	temp.i = c1.i + c2.i;
	return(temp);
}
complex sub(complex c1, complex c2){
	complex temp;
	temp.r = c1.r - c2.r;
	temp.i = c1.i - c2.i;
	return(temp);
}
complex mul(complex c1, complex c2){
	complex temp;
	temp.r = (c1.r * c2.r)-(c1.i * c2.i);
	temp.i = (c1.r * c2.i)+(c1.i * c2.r);
	return (temp);
}
void main(){
	clrscr();
	complex x,y,z;
	int a1,a2,b1,b2,n;
	cout<<"Enter the real & imaginary part of 1st complex number: "<<endl;
	cin>>a1>>b1;
	cout<<"Enter thr real & imaginary part of 2nd complex number: "<<endl;
	cin>>a2>>b2;
	x.input(a1,b1);
	y.input(a2,b2);
	cout<<"Enter your choise:"<<endl;
	cout<<"1. Addition"<<endl;
	cout<<"2. Subtraction"<<endl;
	cout<<"3. Multiplication"<<endl;
	cin>>n;
	switch(n){
		case 1:
			z = add(x,y);
			break;
		case 2:
			z = sub(x,y);
			break;
		case 3:
			z = mul(x,y);
			break;
		default:
			cout<<"Invalid input";
	}
	cout<<"answer = "; z.display(z);
	getch();
}