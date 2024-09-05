//bubble sort using template:
#include<iostream.h>
#include<conio.h>
const n=5;
template <class b>
class sort{
	b *s,c;
	int i,j;
	public:
		sort(){}
		sort(b *a){
			for(i=0; i<n; i++){
				s[i]=a[i];
			}
		}
		void bubble(){
			for(i=0; i<n; i++){
				for(j=0; j<n-i-1; j++){
					if(s[j]>s[j+1]){
						c = s[j];
						s[j] = s[j+1];
						s[j+1] = c;
					}
				}
			}
			display();
		}
		void display(){
			cout<<"\nafter sorting: \n";
			for(i=0; i<n; i++){
				cout<<s[i]<<" ";
			}
		}
};
void main(){
	clrscr();
	int d[5] = {6,1,9,3,7};
	float e[5] = {4.5,3.2,1.5,9.6,7.3};
	sort <int> s1;
	sort <float> s2;
	s1 = d;
	s2 = e;
	s1.bubble();
	s2.bubble();
	getch();
}
