 import java.io.*;
class areacircle{
public static void main(String args[])throws IOException{
double a,r;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter radius of circle:- ");
r=Double.parseDouble(br.readLine());
a=(r*r*22)/7;
System.out.print("area of circle="+a);
}
}