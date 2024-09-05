//fahrenheit to celcius conversion using java
import java.util.*;
class convertion{
	void fah_to_cel(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit: ");
		double f = sc.nextDouble();
		double c= (f-32)*5/9;
		System.out.println("Celcius = " + c);
	}
}
class temperature2{
	public static void main(String args[]){
		convertion obj = new convertion();
		obj.fah_to_cel();
	}
}