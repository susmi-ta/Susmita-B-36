package pkg;
public class revnumpkg{
	public void rev(int n){
		int a,s=0;
		while(n>0){
			a=n%10;
			n=n/10;
			s=s*10+a;
		}
		System.out.println("reverse is " + s);	
	}
}