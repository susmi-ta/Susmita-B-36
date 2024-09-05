//maximum of three numbers
import java.io.*;
class compare3{
	public static void main(String args[])throws IOException{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter three numbers:- ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		if(a>b && a>c){
		System.out.print("maximum is "+a);
		}
		else if(b>a && b>c){
		        System.out.print("maximum is "+b);
		}	
		else{
			System.out.print("maximum is "+c);
		}
	}
}
	