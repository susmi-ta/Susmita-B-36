//print palindrome strings from a file
#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<conio.h>
class file{
	fstream f;
	int i,j,l,p,g;
	char a[20],c;
	public:
		void palindrome(){
			f.open("abc.txt",ios::in | ios::out);
			f.seekg(0);
			while(f){
				f.get(c);
				if(c == EOF)
					break;
				else{
					j=1;
					for(i=0; i<j; i++){
						if(c==' ' || c=='.' || c==',')
							j=0;
						else
							f.put(a[i]);
					}

				}
				l= strlen(a);
				check();
			}
		}
		void check(){
			p=l-1;
			g=0;
			for(i=0; i<l; i++){
				if(a[i] != a[p])
					g=1;
				p=p-1;
			}
			if(g=1){
				cout<<" ";
				a[i]=c;
			}
		}
};
void main(){
	clrscr();
	file f1;
	f1.palindrome();
	getch();
}
