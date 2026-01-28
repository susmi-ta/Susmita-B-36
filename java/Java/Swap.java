import java.util.*;
class result{
    void s(){
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("Before Swap: 1st Number="+a+" 2nd Number="+b);
        temp=a;
        a=b;
        b=temp;
    System.out.println("After Swap: 1st Number="+a+" 2nd Number="+b);
    }
}

public class Swap {
    public static void main(String args[]){
        result obj=new result();
        obj.s();
    }
}
