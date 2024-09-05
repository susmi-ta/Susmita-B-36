//single inheritance:
class a1{
	public void display(){
		System.out.println("hi");
	}
}
class b1 extends a1{
	public void display1(){
		System.out.println("hello");	
	}
}
class inheri_single{
	public static void main(String args[]){
	b1 x= new b1();
	x.display();
	x.display1();
	}
}	