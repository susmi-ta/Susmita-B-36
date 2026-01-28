import java.util.*;
class check{
    void po_ne(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        String t=(n>=0)?"Number is Positive":"Number is Nagitive";
        System.out.println(t);
    }
}
public class PositiveorNegative{
    public static void main(String args[]){
        check obj=new check();
        obj.po_ne();
    }
}
