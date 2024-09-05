//exception handling (number format exception):-
class excep_num_format{
	public static void main(String args[]){
		int a=0, b,c=0;
		for(int i=0;i<args.length;i++){
			try{
				b= Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e){
				a=a+1;
				System.out.println("invalid number = "+ args[i]);
				continue;
			}
			c=c+1;
		}
		System.out.println("valid number = " + c);
		System.out.println("invalid number = " + a);
		
	}
}