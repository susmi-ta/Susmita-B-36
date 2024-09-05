//if input= CAF, then short in ascending order i.e., ACF, then print all missing elements between them. i.e., ABCDEF
import java.io.*;
class string5{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String a;
		int l,i;
		char b,c;
		System.out.print("enter a string: ");
		a= br.readLine();
		l= a.length();
		b=a.charAt(0);
		c=a.charAt(0);
		for(i=1; i<l;i++){
			if( (int)b > (int)a.charAt(i) )
				b=a.charAt(i);
			if( (int)c < (int)a.charAt(i) )
				c=a.charAt(i);
		}
		for(i=(int)b ;i<=(int)c; i++)
			System.out.print((char)i);
	}
}
                        		