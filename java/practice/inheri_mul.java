//multiple inheritance (maximum of 3 number):
import java.io.*;
class m1{
	public void max2(int p,int q){
		if(p>q){
			System.out.println("max is " + p);
		}
		else{
			System.out.println("max is " + q);
		}
	}
}
class n1 extends m1{
	public void max3(int p,int q,int r){
		if(p>q && p>r){
			System.out.println("max is " + p);
		}
		if(q>p && q>r){
			System.out.println("max is " + q);
		}
		else{
			System.out.println("max is " + r);
		}
	}
}
class o extends n1{
	public void max4(int p,int q,int r,int s){
		if(p>q && p>r && p>s){
			System.out.println("max is " + p);
		}
		else if(q>p && q>r && q>s){
			System.out.println("max is " + q);
		}
		else if(r>p && r>q && r>s){
			System.out.println("max is " + r);
		}
		else{
			System.out.println("max is " + s);
		}
	}
}
class inheri_mul{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("enter three numbers: ");
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c= Integer.parseInt(br.readLine());
		int d= Integer.parseInt(br.readLine());	
		o x= new o();
		x.max2(a,b);
		x.max3(a,b,c);
		x.max4(a,b,c,d);
	}
}