//gcd of two number using function
import java.io.*;
class fu2{
	void gcd(int x, int y){
		while(x!=y){
			if(x>y){
				x=x-y;
			}
			else{
				y=y-x;
			}
		}
	System.out.println("gcd =" +x);
	}
}
class fungcd{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter two number: ");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		fu2 p=new fu2();
		p.gcd(a,b);
	}
}