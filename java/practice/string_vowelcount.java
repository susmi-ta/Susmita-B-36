//count number of vowel present in a string:
import java.io.*;
class string_vowelcount{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s;
		int c=0;
		System.out.print("enter the string: ");
		s= br.readLine();
		int l= s.length();
		for(int i=0;i<l;i++){
			char t=s.charAt(i);
			if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u' || t=='A' || t=='E' || t=='I' || t=='O' || t=='U'){
				c=c+1;
			}
		}
		System.out.print("number of vowels = " + c);
	}
}
