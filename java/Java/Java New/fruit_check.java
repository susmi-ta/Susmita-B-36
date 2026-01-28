import java.util.Scanner;
public class fruit_check{
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fruit:");
        String fruit=sc.next();
        switch(fruit){
            case "Mango":
                System.out.println("Yellow");
                break;
            case "Apple":
                System.out.println("Red");
                break;
            case "Orange":
                System.out.println("Orange");
                break;
            default:
                System.out.println("Invalid fruit");
        }
    }
}