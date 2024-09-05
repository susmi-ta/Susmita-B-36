package pkg;
public class max3pkg{
	public void max3(int x, int y, int z){
		if(x>y && x>z){
			System.out.println("maximum is " + x);
		}
		else if (y>x && y>z){
			System.out.println("maximum is " + y);
		}
		else{
			System.out.println("maximum is " + z);
		}
	}
} 