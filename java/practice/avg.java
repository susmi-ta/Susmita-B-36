import java.io.*;
class avg{
public static void main(String args[])throws IOException{
int a,b,c,d,e,f;
double g;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter five numbers:- ");
a,b,c,d,e=Integer.parseInt(br.readLine());
f=a+b+c+d+e;
g=f/5;
System.out.print("average="+g);
}
}