import java.util.Scanner;
public class palindrome {
    void check(int n){
        int r=n;
        int rev=0;
        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(rev==r){
            System.out.println("It is a palindrome number.");
        }
        else{
            System.out.println("It is not a palindrome number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        palindrome pl=new palindrome();
        pl.check(n);
    }
}
