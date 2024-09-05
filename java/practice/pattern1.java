//print pattern:
//	  *
//	 ###
//	*****
//	 ###
//	  *

import java.io.*;
class pattern1{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,k,n;
		System.out.print("enter the value:- ");
		n= Integer.parseInt(br.readLine());
		for(i=1; i<=n; i++){
			for(k=i;k<n;k++)
				System.out.print(" ");
			for(j=1; j<i*2 ;j++){
				if(i%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1; i>=1; i--){	
			for(k=n;k>i;k--)
				System.out.print(" ");
			for(j=1; j<i*2 ;j++){
				if(i%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}		
}