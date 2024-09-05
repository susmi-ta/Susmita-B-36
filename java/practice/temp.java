import java.io.*;
class temp{
	public static void main(String args[])throws IOException{
		double c,f;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter temperature in celcius:- ");
		c=Double.parseDouble(br.readLine());
		f=(c*9/5)+32;
		System.out.print("temperature in fahrenheit="+f);
	}
}