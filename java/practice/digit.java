import java.io.*;
class digit{
public static void main(String args[])throws IOException{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter a number:- ");
n=Integer.parseInt(br.readLine());
if(n>9 && n<100){
	System.out.print(" two digit number");
}
else{
        System.out.print("not tow digit number");
}
}
}
	