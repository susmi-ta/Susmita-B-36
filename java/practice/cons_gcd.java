//write a program to find gcd of two number using constructor and another external function
import java.io.*;
class fun{
	int a,b;
	fun(int x, int y){
		a=x;
		b=y;
	}
	void gcd(){
		while(a!=b){
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.print("gcd = " + a);
	}
	
}

class cons_gcd{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.print("enter two number: ");
			int x=Integer.parseInt(br.readLine());
			int y=Integer.parseInt(br.readLine());	
			fun p= new fun(x,y);
			p.gcd();
	}
}