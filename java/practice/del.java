import java.io.*;
class del{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]= new int[10],b[]= new int[10];
		int i,j,n,p=1,f=0;
		System.out.print("enter total number of array elements:- ");
		n=Integer.parseInt(br.readLine());
		System.out.print("enter array elements:- ");
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
		b[0]=a[0];
		for(i=1;i<n;i++){
			for(j=0;j<p;j++){
				if(a[i]==b[j]){
					f=1;
				}
			}
			if(f==0){
				b[p]=a[i];
				p=p+1;
			}
			f=0;
		}
		System.out.print("result = ");
		for(i=0;i<p;i++){
			System.out.println(b[i]);
		}
		
	}
}