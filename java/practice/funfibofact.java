//fibonacci series using function
import java.io.*;
class fu5{
	void fibo(int n){
		int a=0,b=1,c,i;
		System.out.print("fibonacci series: " + a + "," + b);	
		for(i=3;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print("," + c);
		}
		System.out.println();
	}
	void factorial(int n){
		int i,s=1;
		for(i=1;i<=n;i++){
			s=s*i;
		}
		System.out.println("factorial = " +s);
	}
}
class funfibofact{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number: ");
		int a=Integer.parseInt(br.readLine());
		fu5 f=new fu5();
		f.fibo(a);
		f.factorial(a);
	}
}