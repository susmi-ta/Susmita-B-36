//copy one file content to another
#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<conio.h>
class file{
	fstream f,g;
	char c;
	public:
		void copyfile(){
			f.open("abc.txt",ios::in | ios::out);
			g.open("def.txt",ios::in | ios::out);
			f.seekg(0);
			while(f){
				f.get(c);
				if(c == EOF){
					break;
				}
				else{
					g.put(c);
				}
			}
		}
};
void main(){
	clrscr();
	file f1;
	f1.copyfile();
	getch();
}
