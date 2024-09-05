//addition of two 2d array and result will store on 3rd 2d array
import java.io.*;
class array2dsum{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]= new int[20][20], b[][]= new int[20][20], c[][]=new int[20][20];
		int i,j,n;
		System.out.print("enter order of 2d array:- ");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter elements of 1st array:- ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				a[i][j]=Integer.parseInt(br.readLine());
		}
		System.out.println("enter elements of 2nd array:- ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				b[i][j]=Integer.parseInt(br.readLine());
		}	
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		}
		System.out.println("sum = ");	
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}
