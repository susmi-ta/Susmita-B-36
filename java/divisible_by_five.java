//java program to check a number is divisible by 5 or not
import java.util.*;
class five{
	void check(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int  n = sc.nextInt();
		String ans= (n%5==0)?"divisible" : "not divisible";
		System.out.print(n+ " is "+ ans + " by 5");	
	}
}
class divisible_by_five{
	public static void main(String args[]){
		five obj = new five();
		obj.check();
	}
}