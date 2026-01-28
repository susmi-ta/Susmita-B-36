import java.util.Scanner;
class mul{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("\nInput First Number:");
        a=in.nextInt();
        System.out.println("\nInput Second Number:");
        b=in.nextInt();
        c=a*b;
        System.out.println("\nMul="+c);
    }
}
