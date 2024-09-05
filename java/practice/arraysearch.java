//to search a specific number from an array
import java.io.*;
class arraysearch{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]= new int[10];
		int i,s,f=0;
		System.out.print("enter 10 array elements:- ");
		for(i=0;i<10;i++)
			a[i]=Integer.parseInt(br.readLine());
		System.out.print("enter searching element: ");
		s=Integer.parseInt(br.readLine());
		for(i=0; i<10;i++){
			if(s==a[i])
				f++;
		}
		if(f==0)
			System.out.print("searching element not found");
		else
			System.out.print("searching element found");
	}
}