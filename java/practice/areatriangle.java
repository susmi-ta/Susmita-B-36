//area of triangle using java:
import java.io.*;
class areatriangle{
	public static void main(String args[])throws IOException{
		double a,b,h;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter base of triangle:- ");
		b=Double.parseDouble(br.readLine());
		System.out.print("enter height of triangle:- ");
		h=Double.parseDouble(br.readLine());
		a=0.5*b*h;
		System.out.print("area of triangle="+a);
	}
}