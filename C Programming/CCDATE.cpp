//addition of two dates:
#include<iostream.h>
#include<conio.h>
class adddate{
	int day, month, year;
	public:
		void getdate(){
			cout<<"enter date in dd-mm-yy format: "<<endl;
			cin>>day>>month>>year;
		}
		void putdate(){
			cout<<day<<" days "<<month<<" months "<<year<<" years"<<endl;
		}
		void add(adddate d1, adddate d2){
			day= d1.day + d2.day;
			month= (day/30) + d1.month + d2.month;
			year = (month/12) + d1.year + d2.year;
			day= day%30;
			month= month%12;
		}
};
void main(){
	clrscr();
	adddate d1,d2,d3;
	d1.getdate();
	d2.getdate();
	d3.add(d1,d2);

	cout<<"date 1 = ";
	d1.putdate();
	cout<<"date 2 = ";
	d2.putdate();
	cout<<"Sum of dates = ";
	d3.putdate();
	getch();
}
