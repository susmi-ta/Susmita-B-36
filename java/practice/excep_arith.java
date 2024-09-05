//Exception handling (arithmatic exception):-
class excep_arith{
	public static void main(String args[]){
		int a=10, b=5,c=5;
		try{
			int d= a/(b-c);
		}
		catch(ArithmeticException e){
			System.out.println("error is divide by zero");
		}
		System.out.println("arnab");
	}
}
