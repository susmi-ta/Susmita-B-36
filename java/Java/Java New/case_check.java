import java.util.Scanner;
public class case_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch=sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }
    }
}
