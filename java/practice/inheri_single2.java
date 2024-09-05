//single inheritence(max of 2 and 3 number)
import java.io.*;
class m{
	public void max2(int p,int q){
		if(p>q){
			System.out.println("max is " + p);
		}
		else{
			System.out.println("max is " + q);
		}
	}
}
class n extends m{
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
class inheri_single2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("enter three numbers: ");
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c= Integer.parseInt(br.readLine());
		n x= new n();
		x.max2(a,b);
		x.max3(a,b,c);
	}
}