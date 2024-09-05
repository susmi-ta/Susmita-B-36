import java.io.*;
class compare2{
	public static void main(String args[])throws IOException{
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter two numbers:- ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		if(a>b){
			System.out.print("maximum is "+a);
		}
		else{
 		        System.out.print("maximum is "+b);
		}
	}
}
	