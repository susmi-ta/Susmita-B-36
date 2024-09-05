//to check a year is either leap year or not
import java.io.*;
class leapyear{
	public static void main(String args[])throws IOException{
		int a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter year:- ");
		a=Integer.parseInt(br.readLine());
		if(a%400==0){
			System.out.print("leap year");
		}
		else if(a%100==0){
			System.out.print("not leap year");
		}
		else if(a%4==0){
			System.out.print("leap year");
		}
		else{
			System.out.print("not leap year");
		}
	}
}