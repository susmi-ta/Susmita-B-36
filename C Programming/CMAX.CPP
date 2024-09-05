//print the student details who got maximum marks among 10 students:
#include<iostream.h>
#include<conio.h>
class student{
	char name[20];
	int roll;
	float marks;
	static int m;
	public:
		void input(){
			cout<<"Roll: ";
			cin>>roll;
			cout<<"Name: ";
			cin>>name;
			cout<<"Marks: ";
			cin>>marks;
		}
		void max(){
			if(marks>=m)
				m=marks;
		}
		void output(){
			if(marks==m){
				cout<<"Roll: "<<roll<<" ,name: "<<name<<", marks :"<<marks<<endl;

			}
		}
};
int student::m;
const int n=10;
void main(){
	clrscr();
	student s[n];
	for(int i=0; i<n; i++){
		cout<<endl<<"Enter details of student "<<i+1<<": "<<endl;
		s[i].input();
	}
	for(i=0; i<n; i++){
		s[i].max();
	}
	cout<<"\nDetails of student who got higest marks is:- "<<endl;
	for(i=0; i<n; i++){
		s[i].output();
	}
	getch();
}