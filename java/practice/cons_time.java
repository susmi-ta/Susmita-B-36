import java.io.*;
class tiadd{
	int a,b,c,h1,h2,m1,m2,s1,s2;
	tiadd(int p,int q, int r, int s,int t, int u){
		h1=p;
		h2=q;
		m1=r;
		m2=s;
		s1=t;
		s2=u;
	}
	void time(){
		a=h1+h2;
		b=m1+m2;
		c=s1+s2;
		if(c>=60){
			b=b+(c/60);
			c=c%60;
		}
		if(b>=60){
			a=a+(b/60);
			b=b%60;
		}
		System.out.println("after addition,time is: " + a +" hr:" +b+" min:"+c+" sec");
	}
}
class cons_time{
	public static void main(String argd[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter first time in hr:min:sec format ");
		int d,e,f,g,h,i;
		d=Integer.parseInt(br.readLine());
		e=Integer.parseInt(br.readLine());
		f=Integer.parseInt(br.readLine());
		System.out.println("enter second time in hr:min:sec format ");
		g=Integer.parseInt(br.readLine());
		h=Integer.parseInt(br.readLine());
		i=Integer.parseInt(br.readLine());
		tiadd x= new tiadd(d,g,e,h,f,i);
		x.time();
	}
}