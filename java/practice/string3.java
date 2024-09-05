//input: ab, then output is aaa aba aaa (in square form)
import java.io.*;
class string3{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		System.out.println("enter a string: ");	
		int i,l,j,k,m;
		String s=br.readLine();
		l=s.length();
		for(i=0;i<l;i++){
			for(j=0;j<l;j++){
				if(i>=j)
					System.out.print(" "+ s.charAt(j));
				else
					System.out.print(" "+ s.charAt(i));
			}
			for(j=l-2;j>=0;j--){
				if(i<=j)
					System.out.print(" "+ s.charAt(i));
				else
					System.out.print(" "+ s.charAt(j));
			}
			System.out.println();
		}
		for(i=1;i<l;i++){
			k=l-i-1;
			for(j=0;j<l;j++){
				if(k<j)
					System.out.print(" "+ s.charAt(k));
				else
					System.out.print(" "+ s.charAt(j));
			}
			m=l-1-i;
			for(j=l-2;j>=0;j--){
				if(m>=j)
					System.out.print(" "+ s.charAt(j));
				else
					System.out.print(" "+ s.charAt(m));
			}
			System.out.println();
		}		
	}
}