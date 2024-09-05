//convert all capital letters to small and all small letters to capital present in a string
import java.io.*;
class string_caps{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s,r="";
		int l,j;
		System.out.print("enter the string: ");
		s= br.readLine();
		l= s.length();
		for(int i=0; i<l; i++){
			char c= s.charAt(i);
			if((int) c>=65 && (int) c<=90){
				int p=c+32;	
				r= r+ (char) p;
			}
			if( (int) c>=97 && (int) c<=122 ){
				int p=c-32;	
				r= r+ (char) p;
			}	 
		}
		System.out.print("after converting: " + r);
		
	}
}
