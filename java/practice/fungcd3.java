import java.io.*;
class fu3{
	int gcd3(int x, int y){
		while(x!=y){
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		return (x);
	}
}
class fungcd3{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter three numbers: ");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		fu3 p=new fu3();
		int d=p.gcd3(a,b);
		int e=p.gcd3(d,c);
		System.out.println("GCD = " + e);
	}
}