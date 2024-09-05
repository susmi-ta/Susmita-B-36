import java.io.*;
class fu3{
	void lcm(int x, int y){
		int c,d;
		c=x*y;
		while(x!=y){
			if(x>y){
				x=x-y;
			}
			else{
				y=y-x;
			}
		}
		d=c/x;
	System.out.println("lcm =" +d);
	}
}
class funlcm{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter two number: ");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		fu3 p=new fu3();
		p.lcm(a,b);
	}
}