//c++ program to represent a bank account and performing deposite, withdraw, display using class & object
#include<iostream.h>
#include<conio.h>
class bank{
	char name[20],actype[20];
	int acno,bal,i_bal;
	public:
	void getinfo(){
		cout<<"Enter account holder's details: "<<endl;
		cout<<"name: ";
		cin>>name;
		cout<<"account number: ";
		cin>>acno;
		cout<<"account type: ";
		cin>>actype;
		cout<<"Balance: ";
		cin>>bal;
		i_bal=bal;
	}
	void initial(){
		cout<<"Name: "<<name<<endl;
		cout<<"Account number: "<<acno<<endl;
		cout<<"Account Type: "<<actype<<endl;
		cout<<"Balance: "<<i_bal<<endl;
	}
	void deposite(){
		int d;
		cout<<"Enter deposite amount: ";
		cin>>d;
		bal= bal+d;
		cout<<"successfully deposited. New Balance: "<<bal<<endl;
	}
	void withdraw(){
		int w;
		cout<<"Enter the withdrawal amount: ";
		cin>>w;
		if(w>bal)
			cout<<"Insufficient balance.."<<endl;
		else{
			bal= bal-w;
			cout<<"Successfully withdrawn. New Balance: "<<bal<<endl;
		}
	}
	void display(){
		cout<<"Name: "<<name<<endl;
		cout<<"Balance: "<<bal<<endl;
	}
};
void main(){
	clrscr();
	int n,i=1;
	bank b1;
	b1.getinfo();
	while(i){
		cout<<"Enter your choice..."<<endl;
		cout<<"\n1. Display initial values"<<endl;
		cout<<"2. Deposite"<<endl;
		cout<<"3. Withdraw"<<endl;
		cout<<"4. Display name & balance"<<endl;
		cout<<"5. Exit"<<endl;
		cin>>n;
		switch(n){
			case 1:
				b1.initial();
				break;
			case 2:
				b1.deposite();
				break;
			case 3:
				b1.withdraw();
				break;
			case 4:
				b1.display();
				break;
			case 5:
				i=0;
				break;
			default:
				cout<<"invalid input..."<<endl;
				break;
		}
	}
}