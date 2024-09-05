import java.io.*;
class prime{
public static void main(String args[])throws IOException{
int n,f=0,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter a number:- ");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++){
	if(n%i==0){
		f++;
	}
}
if(f==2){
	System.out.print("prime number");
}
else{
	System.out.print("not prime number");
}
}
}