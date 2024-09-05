//java program to check a year is either leap year or not
import java.util.*;
class year{
	void check(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter year: ");
		int  y = sc.nextInt();
		if(y%400 == 0)
			System.out.print(y+ " is a leap year");
		else if(y%100 == 0)
			System.out.print(y+ " is not leap year");
		else if(y%4 == 0)
			System.out.print(y+ " is a leap year");
		else
			System.out.print(y+ " is not a leap year");
	}
}
class leap_year{
	public static void main(String args[]){
		year obj = new year();
		obj.check();
	}
}