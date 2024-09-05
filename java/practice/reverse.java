import java.io.*;
class reverse{
public static void main(String args[])throws IOException{
int n,a,s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter a number:- ");
n=Integer.parseInt(br.readLine());
while(n>0){
	a=n%10;
	n=n/10;
	s=s*10+a;
}
System.out.print("reverse is " +s);
}
}