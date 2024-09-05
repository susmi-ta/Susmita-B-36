import java.io.*;
class strin{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String a,b,c="",d="",e="";
		int l1,l2,t;
		System.out.print("enter your full name: ");
		a= br.readLine();
		l1= a.length();
		System.out.print("enter full name of your best friend: ");
		b= br.readLine();
		l2= b.length();
		c=c+a.charAt(0);
		d=d+b.charAt(0);
		for(int i=0;i<l1;i++){
			t=0;
			for(int j=0; j<c.length();j++){
				if(a.charAt(i) == c.charAt(j))
					t++;
			}
			if(t==0 && a.charAt(i)!=' '){	
				c=c+a.charAt(i);
			}
		}
		for(int i=0;i<l2;i++){
			t=0;
			for(int j=0; j<d.length();j++){
				if(b.charAt(i) == d.charAt(j))
					t++;
			}
			if(t==0 && b.charAt(i)!=' '){	
				d=d+b.charAt(i);
			}
		}
		for(int i=0;i<c.length();i++){
			for(int j=0;j<d.length();j++){
				if(c.charAt(i)==d.charAt(j)){
					e=e+c.charAt(i);
				}
			}
		}
		System.out.println("Unique characters of your name:");
		for(int i=0; i<c.length(); i++){
			System.out.print(c.charAt(i));
			if(i<c.length()-1)
				System.out.print(",");
		}
		System.out.println();
		System.out.println("Unique characters of name of your bestfriend:");
		for(int i=0; i<d.length(); i++){
			System.out.print(d.charAt(i));
			if(i<d.length()-1)
				System.out.print(",");
		}
		System.out.println();
		System.out.println("Number of matched unique characters are:");
		for(int i=0; i<e.length(); i++){
			System.out.print(e.charAt(i));
			if(i<e.length()-1)
				System.out.print(",");
		}
		System.out.println();
	}
}