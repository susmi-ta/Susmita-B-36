import java.util.Scanner;
public class percentage {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks of 5 subjects:");
        System.out.println("Beng:");
        double b=sc.nextDouble();
        System.out.println("Eng:");
        double e=sc.nextDouble();
        System.out.println("Math:");
        double m=sc.nextDouble();
        System.out.println("Sci:");
        double s=sc.nextDouble();
        System.out.println("Geo:");
        double g=sc.nextDouble();
        double p=((b+e+m+s+g)/500)*100;
        System.out.println("Percentage of 5 marks is ");
        System.out.print(p);
    }
}
