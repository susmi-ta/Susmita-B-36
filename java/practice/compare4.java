import java.io.*;
class compare4{
public static void main(String args[])throws IOException{
int a,b,c,d;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter four numbers:- ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
d=Integer.parseInt(br.readLine());
if(a>b && a>c && a>d){
	System.out.print("maximum is "+a);
}
else if(b>a && b>c && b>d){
        System.out.print("maximum is "+b);
}
else if(c>a && c>b && c>d){
	 System.out.print("maximum is "+c);
}
else{
	 System.out.print("maximum is "+d);	
}
}
}
	