//if input= afbecd, then 1st output=abc ; 2nd output=def
import java.io.*;
class string4{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s,a="",b="";		
		int l,i,t;
		System.out.print("enter the string: ");
		s= br.readLine();
		l= s.length();
		for(i=0;i<l;i+=2){
			a= a+ s.charAt(i);
			if((i+1)>= l)
				break;
			else
				b= b+ s.charAt(i+1);
		}
		System.out.println(a);
		for(i=b.length()-1; i>=0; i--)
			System.out.print(b.charAt(i));				
	}
}
		