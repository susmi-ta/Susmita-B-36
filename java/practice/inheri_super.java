//inheritance (super referance variable)
class ab1{
	int x;	
	ab1(int x){
		this.x= x;
	}
	void function(){
		System.out.println(x);
	}
}
class ab2 extends ab1{
	int y;	
	ab2(int x, int p){
		super (x);
		y=p;	
	}
	void function1(){
		System.out.println(y);
	}
}
class inheri_super{
	public static void main(String args[]){
	ab2 r = new ab2(4,5);	
	r.function();	
	r.function1();
	}
}