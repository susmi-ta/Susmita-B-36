import java.io.*;
class fu4{
	void prime(int n){
		int f=0,i;
		for(i=1;i<=n;i++){
			if(n%i==0)
				f++;	
		}
		if(f==2)
			System.out.println(n +" is prime number ");
		else 
			System.out.println(n +" is not prime number");
	}
	void composite(int n){
		int f=0,i;
		for(i=1;i<=n;i++){
			if(n%i==0)
				f++;	
		}
		if(f>2)
			System.out.println(n +" is composite number ");
		else 
			System.out.println(n +" is not composite number");
	}
}
class funprimecompo2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number: ");
		int a=Integer.parseInt(br.readLine());
		fu4 p=new fu4();
		p.prime(a);
		p.composite(a);
	}
}
		