import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of mathematics,physics and chemistry:");
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        if(m>=60){
            System.out.println("Eligible");
        }
        else if(p>=50){
            System.out.println("Eligible");
        }
        else if(c>=40){
            System.out.println("Eligible");
        }
        else if((m+p+c)>=200||(m+p)>=150){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
