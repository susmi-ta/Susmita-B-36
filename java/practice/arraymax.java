import java.io.*;
class arraymax{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]= new int[10];
		int i,max;
		System.out.print("enter 10 array elements:- ");
		for(i=0;i<10;i++)
			a[i]=Integer.parseInt(br.readLine());
		max=a[0];
		for(i=1; i<10;i++){
			if(max<a[i])
				max=a[i];
		}
		System.out.print("maximum number is= " +max);
}
}