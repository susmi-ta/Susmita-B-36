//inserting data to a file using c++ (witho out class and object)
#include<iostream.h>
#include<fstream.h>
#include<string.h>
#include<conio.h>
#include<stdio.h>
void main(){
	clrscr();
	char s[80],c;
	cout<<"enter the string:"<<endl;
	//cin>>s;
	gets(s);
	int l= strlen(s);
	fstream f;
	f.open("abc.txt",ios::in | ios::out);
	for(int i=0 ; i<l ; i++){
	       f.put(s[i]);
	}
	f.seekg(0);
	cout<<"file component is:"<<endl;
	while(f){
		f.get(c);
		cout<<c;
	}
	getch();
}
