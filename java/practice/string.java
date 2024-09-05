import java.io.*;
class string{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String s,r="";
		System.out.print("enter the string: ");
		s= br.readLine();
		System.out.println("string = " + s);

		int l= s.length();
		System.out.println("length = " + l);
	
		char c= s.charAt(l-1);
		System.out.println("character = " + c);	

		for(int i=l-1; i>=0; i--){
			r=r+s.charAt(i);
		}
		System.out.println("reverse string= " +r );

		int d= s.compareTo(r);
		System.out.println("compare = "+d);
		int e= r.compareTo(s);
		System.out.println("compare = "+e);

		System.out.println("Boolean result = " + s.equals(r));

		String m="ABC", n="abc";
		System.out.println("Ignore Case = " + m.equalsIgnoreCase(n));

		String p= "arnab";
		String q= p+" is a good boy";
		System.out.println("result = "+ q);
		String t= q.substring(7);
		System.out.println("Substring = "+ t);
		String u= q.substring(3,8);
		System.out.println("new substring = " + u);

		int f= q.indexOf ('o');
		System.out.println("Index = " + f);

		int g= q.lastIndexOf('o');
		System.out.println("last index = " + g);

		String h= q.toUpperCase();
		System.out.println("upper Case = " + h);

		String j= q.toLowerCase();
		System.out.println("lower Case = " + j);

		String k= " " + q + " ";
		System.out.println("new result = " + k);
		String l1= k.trim();
		System.out.println("after trim = " + l1);

		String a1= "apple";
		String b1= a1.replace('p','x');
		System.out.println("after replace = " + b1);
		String t1= q.replace("arnab", "arpan");
		System.out.println("replace = " + t1);
	}
}