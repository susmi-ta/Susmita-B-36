//to check a string is either palindrome or not
import java.io.*;
class string_palindrome{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s,t="";
		System.out.print("enter the string: ");
		s= br.readLine();
		int l= s.length();
		for(int i=l-1; i>=0; i--){
			 t= t+ s.charAt(i);
		}
		if(s.equals(t)){
			System.out.println("string palindrome");
		}
		else{
			System.out.println("string is not palindrome");
		}
	}
}
