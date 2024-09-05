import java.io.*;
class add{
public static void main(String args[])throws IOException{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter two numbers:- ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.print("sum="+c);
}
}