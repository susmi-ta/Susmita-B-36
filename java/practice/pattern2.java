import java.io.*;
class pattern2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,k,n;
		System.out.print("enter the value:- ");
		n= Integer.parseInt(br.readLine());

		for(i=1; i<=n; i++){
			for(k=j=1;j<i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}		
}