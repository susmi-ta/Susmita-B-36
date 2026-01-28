import util.java.Scanner;
public class swap_methods{
    public static void main(String args[]){
        int s=swap(10,20);
        System.out.println(s);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        
    }
}