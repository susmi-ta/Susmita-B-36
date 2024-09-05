import java.io.*;
class cmpr{
	cmpr(int a, int b){
		if(a==b)
			System.out.println("two integers are equal");
		else
			System.out.print("two integers are not equal");
	}
	cmpr(double x, double y){
		if(x==y)
			System.out.println("two floating point numbers are equal");
		else
			System.out.print("two floating point numbers are not equal");
	}
	cmpr(String m,String n){
		if( n.equals(m) ){
			System.out.println("two strings are equal");
		}
		else{
			System.out.print("two strings are not equal");
		}
	}
}
class cons_compare{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));	
		System.out.println("enter two integers: ");	
		int c= Integer.parseInt(br.readLine());	
		int d= Integer.parseInt(br.readLine());	
		cmpr p=new cmpr(c,d);
		System.out.println("enter two floating numbers: ");	
		double e= Double.parseDouble(br.readLine());	
		double f= Double.parseDouble(br.readLine());	
		cmpr q=new cmpr(e,f);
		System.out.println("enter two strings: ");	
		String g= br.readLine();	
		String h= br.readLine();	
		cmpr r=new cmpr(g,h);
	}
}	