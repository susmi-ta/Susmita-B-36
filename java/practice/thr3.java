class a extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			if(i==1){
				yield();
			}
			System.out.println("i = " +i);
		}
		
	}
}
class b extends Thread{
	public void run(){
		for(int j=1;j<=5;j++){
			System.out.println("j = " +j);
			if(j==3){
				stop();
			}
		}
	}
}
class c extends Thread{
	public void run(){
		for(int k=1;k<=5;k++){
			System.out.println("k = " +k);
			try{
				sleep(1000);	
			}
			catch(Exception e){}
		}
	}
}
class thr3 {
public static void main(String args[]){
	a m1 = new a();
	b m2 = new b();
	c m3 = new c();
	m1.start();
	m2.start();
	m3.start();
	
}
}