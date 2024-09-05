//if user inputs "subhas chandra bose", output will "bose chandra subhas"
import java.io.*;
class string2{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s,u="",r="";
		int l;
		System.out.print("enter the string: ");
		s= br.readLine();
		s=" " +s;
		l= s.length();
		int t=l;
		for(int i=l-1; i>=0; i--){
			if( s.charAt(i)!= ' '){
				u= s.charAt(i)+u;
			}
			else{
				r=r+" "+u;
				u="";
			}
		}
		System.out.print(r);
	}
}
