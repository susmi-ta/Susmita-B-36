class fu1{
	void add(int a,int b){
		int c;
		c=a+b;
		System.out.println("sum = "+ c);
	}
	int sub(int a,int b){
		int c;
		c=a-b;
		return (c);
	}
	void mul(int a,int b){
		System.out.println("mul = "+a*b);
	}
}
class funsumsubmul{
	public static void main(String args[]){
		fu1 ob=new fu1();
		ob.add(2,3);
		int d=ob.sub(2,3);
		System.out.println("sub =" +d);
		ob.mul(2,3);
	}
}