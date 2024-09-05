//area and perimeter of circle using java
import java.util.*;
class calculate{
	void area_perimeter(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double r = sc.nextDouble();
		double a = 3.14*r*r;
		System.out.println("Area of circle = " + a);
		double p= 2*3.14*r;
		System.out.println("Perimeter of circle = " + p);
	}
}
class circle{
	public static void main(String args[]){
		calculate obj = new calculate();
		obj.area_perimeter();
	}
}