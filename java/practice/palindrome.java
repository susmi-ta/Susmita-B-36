import java.io.*;
class palindrome{
public static void main(String args[])throws IOException{
int n,a,s=0,p;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter a number:- ");
n=Integer.parseInt(br.readLine());
p=n;
while(n>0){
	a=n%10;
	n=n/10;
	s=s*10+a;
}
if(p==s)
	System.out.print("palindrome number");
else
	System.out.print("not palindrome number");
}
}