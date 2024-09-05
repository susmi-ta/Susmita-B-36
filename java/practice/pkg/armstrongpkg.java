package pkg;
public class armstrongpkg{
	public void armstrong(int n){
		int a,s=0,p;
		p=n;
		while(n>0){
			a=n%10;
			n=n/10;
			s=s+a*a*a;
		}
		if(p==s){
			System.out.println(p + " is an armstrong number");
		}
		else{
			System.out.println(p + " is not an armstrong number");
		}	
	}
}