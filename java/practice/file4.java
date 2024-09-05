//write a program to count total number of vowels, non-vowels, space and new line present in a file.
import java.io.*;
class file4{
	public static void main(String args[]){
		File a = new File("input1.txt");
		try{	
			FileReader aa = new FileReader(a);
			int c,v=0,nv=0,s=0,l=0;
			while( (c=aa.read()) != -1 ){
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
					v++;			
				}
				if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
					nv++;
				}
				if(c==' '){
					s++;
				}
				if(c=='\n'){
					l++;
				}			
			}
		aa.close();
		System.out.println("Total number of vowels present in file = " + v);	
		System.out.println("Total number of non-vowels present in file = " + nv);
		System.out.println("Total number of space present in file = " + s);
		System.out.println("Total number of new line present in file = " + l);
		}
		catch(IOException e){}
	}
}
