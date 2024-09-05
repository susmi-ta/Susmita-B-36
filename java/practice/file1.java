//copy a file content into another file:
import java.io.*;
class file1{
	public static void main(String args[]){
		File a = new File("input.txt");
		File b = new File ("output.txt");
		try{	
			FileReader aa = new FileReader(a);
			FileWriter bb = new FileWriter(b);
			int c;
			while( (c=aa.read()) != -1 ){
				bb.write(c);	
			}
		aa.close();
		bb.close();
		}
		catch(IOException e){}
	}
}
		