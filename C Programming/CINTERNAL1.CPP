#include<iostream.h>
#include<string.h>
#include<conio.h>
class strcount{
	char a[50];
	int i,j,l;
	public:
		void input(){
			cout<<"Enter a sentence: "<<endl;
			a[0]=' ';
			getc(a);
			l=strlen(a);
		}
		void count(){
			j=0;
			for(i=0; i<l ;i++){
				if((a[i]=='h'||a[i]=='H') && (a[i+1]=='E'||a[i+1]=='e') && (a[i+2]==' '||a[i+2]=='.'||a[i+2]==',')&&(a[i-1]==' '|| a[i-1]=='.'||a[i-1]==','))
					j++;
			}
			cout<<j;
		}
};
void main(){
	clrscr();
	strcount c;
	c.input();
	c.count();
	getch();
}


