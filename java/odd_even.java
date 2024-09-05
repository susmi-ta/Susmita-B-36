//number is either odd or even
import java.util.*;
class check{
	void num_check(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println(n + " is an even number");
		else
			System.out.println(n + " is an odd number"); 
	}
}
class odd_even{
	public static void main(String args[]){
		check obj = new check();
		obj.num_check();
	}
}