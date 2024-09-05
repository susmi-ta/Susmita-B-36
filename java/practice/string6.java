//if 1st input= abc; 2nd input= def; output= afbecd
import java.io.*;
class string6{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String a,b,r="";
		int l1,l2,j;
		System.out.print("enter 1st string: ");
		a= br.readLine();
		l1= a.length();
		System.out.print("enter 2nd string: ");
		b= br.readLine();
		l2= b.length();
		j=l2;
		if(l1!=l2){
			System.out.println("invalid input");
		}
		else{
			for(int i=0;i<l1;i++){
				j--;
				r= r+ a.charAt(i)+ b.charAt(j);
			}
		}
		System.out.println(r);
	}
}
				