//to check a number is either even or odd using try and catch:-
class excep_program1{
	public static void main(String args[]){
		System.out.print("enter a number:- ");
			try{
				
				int b= Integer.parseInt(args[0]);
				if(b%2==0)
					System.out.println("even number");
				else
					System.out.println("odd number");
			}
			catch(NumberFormatException e){
				System.out.println("invalid number");
			}
	
	}
}