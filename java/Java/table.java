import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to see multiplication table:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int r=n*i;
            System.out.println(n+"*"+i+"="+r);
        }
    }
}
