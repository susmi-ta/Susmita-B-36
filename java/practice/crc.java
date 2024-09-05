//cyclic redundancy check program:
import java.io.*;
class crc{
	String input,divisor,divident,result;
	int len_inp,len_divs,len_divi;
	public void getdata()throws IOException{
		System.out.print("enter the input: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		input=br.readLine();
		System.out.print("enter the divisor: ");
		divisor=br.readLine();
		len_divs=divisor.length();
		len_inp=input.length();
		divident=input;
		int r=len_divs-1;
		for(int i=0;i<r;i++){
			divident=divident+'0';
		}
		len_divi=divident.length();
		modulo_divs();
	}

	public void modulo_divs(){
		String temp_div=divisor;
		String temp_divident=divident.substring(0,len_divs);	
		int j = len_divs;
		while(j<len_divi){
			temp_divident=fun_xor(temp_divident,temp_div);
			temp_divident=temp_divident+divident.charAt(j);
			j++;
		}
		result=input+fun_xor(temp_divident,temp_div);
	}

	String fun_xor(String a, String b){
		result="";
		if (a.charAt(0)=='0'){
		return a.substring(1);
		}
		else{
			for(int i=0;i<len_divs;i++){
				result=result+(a.charAt(i)==b.charAt(i)?'0' : '1');
			}
			return result.substring(1);
		}
	}

	public void senderside(){
		System.out.print("input="+input);
		System.out.println();
		System.out.print("divisor=" + divisor);
		System.out.println();
		System.out.print("divident=" + divident);
		System.out.println();
		System.out.print("result =" + result);
		System.out.println();
	}

	public void receiverside() throws IOException{
		String data_received;
		System.out.println("enter data Received: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		data_received= br.readLine();	
		String temp_div= divisor;
		String temp_divident= data_received.substring(0,len_divs);
		int j= len_divs;
		while( j<data_received.length() ){
			temp_divident= fun_xor(temp_divident,temp_div);	
			temp_divident= temp_divident + data_received.charAt(j);
			j++;	
		}
		String error= fun_xor(temp_divident,temp_div);
		boolean flag = false;
		for(int i=0; i<len_divs-1; i++){
			if(error.charAt(i)=='1'){
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("no error");	
		}
		else{
			System.out.println("error");	
		}
	} 

	public static void main(String args[])throws IOException{
		crc abc=new crc();
		abc.getdata();
		abc.modulo_divs();
		abc.senderside();
		abc.receiverside();
	}
}
