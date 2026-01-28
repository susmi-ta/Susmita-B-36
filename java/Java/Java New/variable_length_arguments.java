import java.util.*;
public class variable_length_arguments{
    public static void main(String[] args){
        fun("Susmita","Arnab","Sampad","Sudipa");
    }
    static void fun(String ...s){
        System.out.println(Arrays.toString(s));
    }
    
} 