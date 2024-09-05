//printing name using java
import java.util.*;
class print{
	void nam(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your name: ");
		String str = sc.nextLine();
		System.out.println("Your name is: " + str);
	}
}
class name{
	public static void main(String args[]){
		print obj = new print();
		obj.nam();
	}
}