//addition of two times:
#include<iostream.h>
#include<conio.h>
class addtime{
	int hr, min, sec;
	public:
		void gettime(){
			cout<<"enter time in hh:min:sec format: "<<endl;
			cin>>hr>>min>>sec;
		}
		void puttime(){
			cout<<hr<<" hours "<<min<<" minutes "<<sec<<" seconds"<<endl;
		}
		void add(addtime t1, addtime t2){
			sec= t1.sec + t2.sec;
			min= (sec/60) + t1.min + t2.min;
			hr = (min/60) + t1.hr + t2.hr;
			sec= sec%60;
			min= min%60;
		}
};
void main(){
	clrscr();
	addtime t1,t2,t3;
	t1.gettime();
	t2.gettime();
	t3.add(t1,t2);

	cout<<"time 1 = ";
	t1.puttime();
	cout<<"time 2 = ";
	t2.puttime();
	cout<<"Sum of times = ";
	t3.puttime();
	getch();
}
