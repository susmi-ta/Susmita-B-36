import java.util.Scanner;
public class calculator_switch_methods{
    public static void main(String args[]){
        int ans= cal(20,10);
        System.out.println(ans);
    }
    static int cal(int a,int b){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a expression:");
        String op=sc.next();
        int c=0;
        switch(op){
            case "+":
                c=a+b;
                break;
                
            case "-":
                c=a-b;
                break;
                
            case "*":
                c=a*b;
                break;
                
            case "/":
                c=a/b;
                break;
                
            case "%":
                c=a%b;
                break;
                
            default:
                System.out.println("Invalid Input");
        }
        return c;
    }
}