import java.io.*;
import pkg.max2pkg;
import pkg.max3pkg;
class maxnumpkg{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("enter three numbers: ");	
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		max2pkg m1 = new max2pkg();
		max3pkg m2 = new max3pkg();
		m1.max2(a,b);	
		m2.max3(a,b,c);
	}
}