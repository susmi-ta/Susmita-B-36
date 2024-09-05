//transppose of a matrix:
import java.io.*;
class matrixtranspose{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]= new int[20][20], b[][]= new int[20][20];
		int i,j,n;
		System.out.print("enter order of square matrix:- ");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter elements of matrix:- ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				a[i][j]=Integer.parseInt(br.readLine());
		}
		System.out.println("matrix looks like: ");	
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				b[j][i]=a[i][j];
		}
		System.out.println("after transpose: ");	
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}
}
