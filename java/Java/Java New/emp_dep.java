import java.util.Scanner;
public class emp_dep{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp id:");
        int emp=sc.nextInt();
        System.out.println("Enter the department:");
        String dep=sc.next();
        switch(emp){
            case 1:
              System.out.println("Susmita Mondal");
              switch(dep){
                case "IT"->System.out.println("IT Department");
                case "man"->System.out.println("Management Department");
                case "sup"->System.out.println("Support Department");
                default-> System.out.println("Enter correct department");
              }
              break;
            case 2:  
                System.out.println("Anoushka Mukharjee");
              switch(dep){
                case "IT"->System.out.println("IT Department");
                case "man"->System.out.println("Management Department");
                case "sup"->System.out.println("Support Department");
                default-> System.out.println("Enter correct department");
              }
              break;
            default:
                System.out.println("Enter correct emp id");
        }
    }
}