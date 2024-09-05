package pkg;
public class palindromepkg{
	public void palindrome(int n){
		int a,s=0,p;
		p=n;
		while(n>0){
			a=n%10;
			n=n/10;
			s=s*10+a;
		}
		if(p==s){
			System.out.println(p + " is a palindrome number");
		}
		else{
			System.out.println(p + " is not a palindrome number");
		}	
	}
}