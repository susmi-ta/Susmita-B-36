import java.util.*;

class grade{
    void g(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Percentage:");
        int p=sc.nextInt();
        if(p>=90 && p<=100){
            System.out.println("Grade=A");
        }
        else if(p<90 && p>=80){
            System.out.println("Grade=B");
        }
        else if(p<80 && p>=70){
            System.out.println("Grade=C");
        }
        else if(p<70 && p>=60){
            System.out.println("Grade=D");
        }
        else if(p<60 && p>=40){
            System.out.println("Grade=E");
        }
        else if(p<40 && p>=0){
            System.out.println("Grade=E");
        }
        else{
            System.out.println("Range should be in between 0 to 100");
        }
    }
}
public class Grading{
    public static void main(String args[]){
        grade obj=new grade();
        obj.g();
    }
}
