import java.util.Scanner;
class Multable {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter a no:");
        int n,i;
        n=in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
