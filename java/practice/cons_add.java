//addition of two number using constructor
class cons2{
	cons2(int a, int b){
		int c= a+b;
		System.out.println(c);
	}
	cons2(int a, int b, int c){
		int d= a+b+c;
		System.out.println(d);
	}
}
class cons_add{
	public static void main(String args[]){
		cons2 p= new cons2(2,3);
		cons2 q= new cons2(2,3,4);
	}
}
