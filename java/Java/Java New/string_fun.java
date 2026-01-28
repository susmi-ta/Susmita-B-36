import java.util.Scanner;
public class string_fun{
    public static void main(String args[]){
        String dis=display();
        System.out.println(dis);
    }
    static String display(){
        Scanner sc=new Scanner(System.in);      
        System.out.print("Enter a Sentence:");
        String s=sc.nextLine();
        return s;
    }
}