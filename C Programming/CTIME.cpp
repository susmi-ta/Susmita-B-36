//add 2 times using c++
#include<iostream.h>
#include<conio.h>
class time{
	int h,h1,h2,m,m1,m2,s,s1,s2;
	public:
	void input(){
		cout<<"enter time 1 in hr,min,sec format: "<<endl;
		cin>>h1>>m1>>s1;
		cout<<"enter time 2 in hr,min,sec format: "<<endl;
		cin>>h2>>m2>>s2;
		add(h1,h2,m1,m2,s1,s2);
	}
	void add(int h1,int h2,int m1, int m2, int s1,int s2){
		s=s1+s2;
		m=m1+m2;
		h=h1+h2;
		if(s>=60){
			m=m+(s/60);
			s=s%60;
		}
		if(m>=60){
			h=h+(m/60);
			m=m%60;
		}
		cout<<"after addition,time is "<<endl
			<<h<<" hr "<<m<<" min "<<s<<" sec ";
	}
};
void main(){
	clrscr();
	time t;
	t.input();
	getch();
}