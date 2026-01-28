import java.util.Scanner;
public class hello_name{
    // public static void main(String args[]){
    //     String sen=sentence();
    //     System.out.println(sen);
        
    // }
    // static String sentence(){
    //     Scanner sc= new Scanner(System.in);
    //     String msg="Hello "+ sc.nextLine();
    //     return msg;
    // }
    public static void main(String args[]){
       sentence();
    }
    static void sentence(){
        Scanner sc= new Scanner(System.in);
        String msg="Hello "+ sc.nextLine();
        System.out.println(msg);
    } 
}