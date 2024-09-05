//celcius to fahrenheit conversion using java
import java.util.*;
class convert{
	void cel_to_fah(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter temperature in celcius: ");
		double c = sc.nextDouble();
		double f= ((double) 9/5 * c) +32;
		System.out.println("Fahrenheit = " + f);
	}
}
class temperature{
	public static void main(String args[]){
		convert obj = new convert();
		obj.cel_to_fah();
	}
}