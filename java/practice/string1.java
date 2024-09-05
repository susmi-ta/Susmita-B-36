//if user inputs "subhas chandra bose", then output will "s.c.b"
import java.io.*;
class string1{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s;
		int l;
		System.out.print("enter the string: ");
		s= br.readLine();
		l= s.length();
		System.out.print(s.charAt(0) +".");
		for(int i=0; i<l; i++){
			if( s.charAt(i) == ' ' ){
				System.out.print( s.charAt(i+1) + "." );
			}
		}
	}
}
