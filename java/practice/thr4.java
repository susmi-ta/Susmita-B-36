//print 10 times bca with a delay and computer science in haphazard manner
class BCA extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("bca");
 			try{Thread.sleep(500);}
			catch(Exception e){}
			
		}
	}
}
class CS extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Computer Science");
			
		}
	}
}
public class thr4{
	
	public static void main(String[] args) {
		
		BCA bca = new BCA();
		CS cs = new CS();
		
		bca.start();
		cs.start();

	}

}