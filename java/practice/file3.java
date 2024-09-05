//program to copy the consonents from one file to another file
import java.io.*;
class file3{
	public static void main(String args[]){
		File a = new File("input1.txt");
		File b = new File ("output1.txt");
		try{	
			FileReader aa = new FileReader(a);
			FileWriter bb = new FileWriter(b);
			int c,t=0;
			while( (c=aa.read()) != -1 ){
				if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
					bb.write(c);			
				}		
			}
		aa.close();
		bb.close();
		}
		catch(IOException e){}
	}
}
