//addition of two dates using c++
#include<iostream.h>
#include<conio.h>
class date{
	int d,d1,d2,m,m1,m2,y,y1,y2;
	public:
	void input(){
		cout<<"enter date 1 in dd.mm.yy format: "<<endl;
		cin>>d1>>m1>>y1;
		cout<<"enter date 2 in dd.mm.yy format: "<<endl;
		cin>>d2>>m2>>y2;
		add(d1,d2,m1,m2,y1,y2);
	}
	void add(int d1,int d2,int m1, int m2, int y1,int y2){
		d=d1+d2;
		if(d>=30){
			m=m1+m2+(d/30);
			d=d%30;
		}
		if(m>=12){
			y=y1+y2+(m/12);
			m=m%12;
		}
		cout<<"after addition,date is "<<endl
			<<d<<" days "<<m<<" months "<<y<<" years ";
	}
};
void main(){
	clrscr();
	date d;
	d.input();
	getch();
}
