import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a=sc.nextInt();
        System.out.println("Enter the second no:");
        int b=sc.nextInt();
        System.out.println("Enter the third no:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest="+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest="+b);
        }
        else{
            System.out.println("Largest="+c);
        }
    }
}
