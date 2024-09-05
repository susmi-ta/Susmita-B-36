//inheritance (interface):
interface f{
	void dis();
}
class g{
	public void dis1(){
		System.out.println("class g");	
	}	
}
class h extends g implements f{
	public void dis(){
		System.out.println("class h");	
	}
}
class intrfce2{
	public static void main (String args[]){	
		h H= new h();
		f F;
		H.dis1();
		F=H;
		F.dis();
	}
}
	