//using multilevel inheritance and _super_, find maximum of 2 , 3, 4 number
import java.io.*;
class m1{	
	int x,y;
	m1(int a,int b){
		x=a;
		y=b;
	}
	public void max1(){
		if(x>y){
			System.out.println("max is " + x);
		}
		else{
			System.out.println("max is " + y);
		}
	}
}
class m2 extends m1{	
	int z;
	m2(int a, int b,int c){
		super (a,b);
		z=c;
	}
	public void max2(){
		if(x>y && x>z){
			System.out.println("max is " + x);
		}
		if(y>x && y>z){
			System.out.println("max is " + y);
		}
		else{
			System.out.println("max is " + z);
		}
	}
}
class m3 extends m2{
	int w;	
	m3(int a, int b, int c, int d){
		super (a,b,c);
		w=d;
	}
	public void max3(){
		if(x>y && x>z && x>w){
			System.out.println("max is " + x);
		}
		if(y>x && y>z && y>w){
			System.out.println("max is " + y);
		}
		if(z>x && z>y && z>w){
			System.out.println("max is " + z);
		}
		else{
			System.out.println("max is " + w);
		}
	}
}
class inheri_super2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("enter four numbers: ");	
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c= Integer.parseInt(br.readLine());
		int d= Integer.parseInt(br.readLine());
		m3 r= new m3(a,b,c,d);
		r.max1();	
		r.max2();
		r.max3();
	}
}