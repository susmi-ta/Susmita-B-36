//thread synchronisation (program of pattern)
class Sync{
 	synchronized void display(char c){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c);
			}
		System.out.println();
	}
}
}
class a extends Thread{
	Sync p;
	a(Sync p){
		this.p=p;
	}
	public void run(){
	p.display('*');
	}
}
class b extends Thread{
	Sync p;
	b(Sync p){
		this.p=p;
	}
	public void run(){
	p.display('#');
	}
}
class thr_sync1{
	public static void main(String[] args){
	Sync sc = new Sync();
	a aObj = new a(sc);
	b bObj = new b(sc);
	aObj.start();
	bObj.start();
}
}