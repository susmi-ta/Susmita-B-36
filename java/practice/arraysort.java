//sorting an array
import java.io.*;
class arraysort{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]= new int[10];
		int i,n,s,j;
		System.out.print("enter total number of array elements: ");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter array elements:- ");
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					s=a[j];
					a[j]=a[j+1];
					a[j+1]=s;
				}
			}
		}
		System.out.println("after sorting:");
		for(i=0;i<n;i++)
			System.out.print(" " +a[i]);
}			
}