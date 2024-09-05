//inserting data to a file using C++
#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<conio.h>
#include<stdio.h>
class file{
	fstream f;
	char s[80],c,l;
	public:
		void input(){
			cout<<"enter the string: "<<endl;
			gets(s);
			l= strlen(s);
		}
		void insertfile(){
			f.open("abc.txt",ios::in | ios::out);
			for(int i=0 ; i<l ; i++){
				f.put(s[i]);
			}
		}
		void display(){
			f.seekg(0);
			cout<<"file component is:"<<endl;
			while(f){
				f.get(c);
				cout<<c;
			}
		}
};
void main(){
	clrscr();
	file f1;
	f1.input();
	f1.insertfile();
	f1.display();
	getch();
}
