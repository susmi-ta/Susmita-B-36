import java.io.*;
import pkg.revnumpkg;
import pkg.armstrongpkg;
import pkg.palindromepkg;
class rev_arm_pal_pkg{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int n;
		System.out.println("enter a number: ");	
		n=Integer.parseInt(br.readLine());	
		revnumpkg r = new revnumpkg();
		armstrongpkg a = new armstrongpkg();
		palindromepkg p = new palindromepkg();
		r.rev(n);
		a.armstrong(n);
		p.palindrome(n);
	}
}