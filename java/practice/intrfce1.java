//inheritance (interface):
interface a{
	int sum(int x, int y);
 	int z=10;
}
class r implements a{
	public int sum(int x, int y){
		return x+y;	
	}	
}
class s implements a{
	public int sum(int x, int y){
		return x+y+z;	
	}
}
class intrfce1{
	public static void main (String args[]){
		r R= new r();	
		s S= new s();
		a A;
		A=R;
		int p= A.sum(2,3);
		A=S;
		int q= A.sum(2,5);
		System.out.println("q =" + p);
		System.out.println("p =" + q);
	}
}
		