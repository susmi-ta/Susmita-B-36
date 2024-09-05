//count number of vowel present in a file using c++
#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<conio.h>
#include<stdio.h>
class file{
	fstream f;
	char c;
	int l,j;
	public:
		void readfile(){
			j=0;
			f.open("abc.txt",ios::in | ios::out);
			f.seekg(0);
			while(f){
				f.get(c);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
					j++;
				}
				if(c == EOF){
					break;
				}
			}
		}
		void display(){
			cout<<"number of vowels is: "<<j<<endl;
		}
};
void main(){
	clrscr();
	file f1;
	f1.readfile();
	f1.display();
	getch();
}
