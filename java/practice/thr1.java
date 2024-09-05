class a extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("i = " +i);
		}
	}
}
class b extends Thread{
	public void run(){
		for(int j=1;j<=5;j++){
			System.out.println("j = " +j);
		}
	}
}
class c extends Thread{
	public void run(){
		for(int k=1;k<=5;k++){
			System.out.println("k = " +k);
		}
	}
}
class thr1 {
	public static void main(String args[]){
		new a().start();
		new b().start();
		new c().start();
	}
}