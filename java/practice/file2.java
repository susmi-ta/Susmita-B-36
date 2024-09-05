//print number of vowel present in a file:
import java.io.*;
class file2{
	public static void main(String args[]){
		File a = new File("input.txt");
		try{	
			FileReader aa = new FileReader(a);
			int c,t=0;
			while( (c=aa.read()) != -1 ){
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
					t++;
				}		
		}
		aa.close();
		System.out.println("Number of vowels present in file = " + t);
		}
		catch(IOException e){}
	}
}
