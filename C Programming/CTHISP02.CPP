//display the largest string among 2 strongs using this pointer
#include<iostream.h>
#include<conio.h>
#include<string.h>
class largestr{
	char str[15];
	int l;
	public:
		largestr(char *s){
			strcpy(str, s);
			l= strlen(str);
		}
		largestr & largestr :: check(largestr &a){
			if(a.l >= l)
				return a;
			else
				return *this;
		}
		void display(){
			cout<<"largest string is "<<str<<endl;
		}
};
void main(){
	clrscr();
	largestr s1("durgapur"), s2("kolkata");
	largestr s = s1.check(s2);
	s.display();
	getch();
}