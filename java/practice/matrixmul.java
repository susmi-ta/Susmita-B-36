import java.io.*;
class matrixmul{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]= new int[20][20], b[][]= new int[20][20], c[][]=new int[20][20];
		int i,j,n,p=0,k;
		System.out.print("enter order of square matrix:- ");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter elements of 1st matrix:- ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				a[i][j]=Integer.parseInt(br.readLine());
		}
		System.out.println("enter elements of 2nd matrix:- ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				b[i][j]=Integer.parseInt(br.readLine());
		}	
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
				p=p+a[i][k]*b[k][j];
				}
				c[i][j]=p;
				p=0;
			}
		}
		System.out.println("after multiplication: ");	
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}