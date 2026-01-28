import java.util.Scanner;
public class name_para_methods{
    public static void main(String args[]){
        String msg=mymsg("Susmita Mondal");
        System.out.println(msg);
    }
    static String mymsg(String name){
        String n="Hello "+ name;
        return n;
    }
}