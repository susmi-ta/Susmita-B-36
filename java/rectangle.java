//area and perimeter of rectangle using java
import java.util.*;
class calculate{
	void area_perimeter(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		double l = sc.nextDouble();
		System.out.print("Enter breadth of rectangle: ");
		double b = sc.nextDouble();
		System.out.println("Area of rectangle = " + (l*b));
		double p= 2*(l+b);
		System.out.println("Perimeter of rectangle = " + p);
	}
}
class rectangle{
	public static void main(String args[]){
		calculate obj = new calculate();
		obj.area_perimeter();
	}
}