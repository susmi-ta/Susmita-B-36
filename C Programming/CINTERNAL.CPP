//decimal to 2s conversion:
#include<iostream.h>
#include<conio.h>
class complement{
	int n,s,i,j,carry,k;
	int a[20],b[20];
	public:
		void convert(int d){
			int x;
			n=0,s=0,i=1;
			while(d>0){
				x= d%2;
				d= d/2;
				s= s+x *i;
				i=i*10;
				n++;
			}
			cout<<"binary number= "<<s<<endl;
		}
		void array(){
			int e;
			for(i=n-1;i>=0;i--){
				e=s%10;
				s=s/10;
				a[i]=e;
			}
		}
		void invert(){
			j=0;
			while(j<n){
				if(a[j]==0)
					a[j]=1;
				else
					a[j]=0;
				j++;
			}
		}
		void twoscomp(){
			carry=1;
			for(i=n-1; i>=0;i--){
				if(a[i]==1 && carry==1){
					b[i]=0;
				}
				else if(a[i]==0 && carry==1){
					b[i]=1;
					carry=0;
				}
				else{
					b[i]=a[i];
				}
			}
		}
		void display(){
			for(i=0;i<n;i++)
				cout<<b[i];
		}
};
void main(){
	clrscr();
	complement c;
	int n;
	cout<<"enter a decimal number: ";
	cin>>n;
	c.convert(n);
	c.array();
	c.invert();
	c.twoscomp();
	cout<<"2s complement= "; c.display();
	getch();
}

