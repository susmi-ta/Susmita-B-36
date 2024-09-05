//java program to convert miles to kilometer
import java.util.*;
class mi_km{
	void convert(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter miles: ");
		double  m = sc.nextDouble();
		double km= m*1.609344;
		System.out.println("Kilometer= " + km);
	}
}
class miles_to_km{
	public static void main(String args[]){
		mi_km obj = new mi_km();
		obj.convert();
	}
}