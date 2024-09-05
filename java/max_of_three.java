//maximum of three numbers
import java.util.*;
class max{
	void max_check(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		int result= (a>b && a>c)?a : (b>a && b>c)?b:c;
		System.out.println("Maximum number is " + result);
	}
}
class max_of_three{
	public static void main(String args[]){
		max obj = new max();
		obj.max_check();
	}
}