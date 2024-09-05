import java.io.*;
class sum2darray{
public static void main (String args[])throws IOException{
int i,s=0,j;
int a[][]=new int[20][20];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter array element");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
a[i][j]=Integer.parseInt(br.readLine());
}}
System.out.println("matrix look like:");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();}
for(i=0;i<10;i++){
for(j=0;j<3;j++){
s=s+a[i][j];
}}
System.out.print("Sum="+s);
}}