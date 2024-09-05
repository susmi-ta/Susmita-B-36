//copy the consonents of one file content to another
#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<conio.h>
class file{
	fstream f,g;
	char c;
	public:
		void copyconsonentfile(){
			f.open("abc.txt",ios::in | ios::out);
			g.open("ghi.txt",ios::in | ios::out);
			f.seekg(0);
			while(f){
				f.get(c);
				if(c == EOF){
					break;
				}
				else if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
					g.put(c);
				}
			}
		}
};
void main(){
	clrscr();
	file f1;
	f1.copyconsonentfile();
	getch();
}
