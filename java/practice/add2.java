import java.io.*;
class add2{
public static void main(String args[])throws IOException{
double a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter two numbers:- ");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=a+b;
System.out.print("sum="+c);
}
}