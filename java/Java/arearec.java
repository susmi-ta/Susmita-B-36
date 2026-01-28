import java.util.Scanner;
public class arearec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth:");
        int b=sc.nextInt();
        int a=l*b;
        int p=2*(l+b);
        System.out.println("Area="+a+",Perimeter="+p);
    }
}
