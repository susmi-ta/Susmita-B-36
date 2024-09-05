import java.io.*;
class fu4{
	void prime(int n){
		int f=0,i;
		for(i=1;i<=n;i++){
			if(n%i==0)
				f++;	
		}
		if(f==2)
			System.out.println(n +" is prime number but not composite number");
		else if(f>2)
			System.out.println(n +" is not prime number but composite number");
		else
			System.out.println(n +" is neither prime number nor composite number");
	}
}
class funprimecompo{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter a number: ");
		int a=Integer.parseInt(br.readLine());
		fu4 p=new fu4();
		p.prime(a);
	}
}
		