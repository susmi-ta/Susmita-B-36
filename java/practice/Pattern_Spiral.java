//print pattern like:
//	1   2  3  4 5
//	16 17 18 19 6
//	15 24 25 20 7
//	14 23 22 21 8
//	13 12 11 10 9

public class Pattern_Spiral{   
	static void printSpiralPattern(int size){    
		int row = 0, col = 0;  
		int boundary = size - 1;  
		int sizeLeft = size - 1;  
		int flag = 1;  
		char move = 'r';  
		int[][] matrix =new int [size][size];  
		for (int i = 1; i < size * size + 1; i++){   
    			matrix[row][col] = i;  
			switch (move){    
				case 'r':  
    					col += 1;  
   					break;  
				case 'l':  
    					col -= 1;  
    					break;  
				case 'u':  
    					row -= 1;  
    					break;  
				case 'd':  
    				row += 1;  
    				break;  
			}    
			if (i == boundary){  
        			boundary = boundary + sizeLeft;  
        			if (flag != 2){  
        				flag = 2;  
        			}  
        			else{  
        				flag = 1;  
        				sizeLeft -= 1;  
        			}    
        			switch (move){   
        				case 'r':  
            					move = 'd';  
            					break;   
        				case 'd':  
            					move = 'l';  
            					break;  
        				case 'l':  
            					move = 'u';  
            					break;    
        				case 'u':  
            					move = 'r';  
            					break;  
        			}  
    			}  
		}   
		for (row = 0; row < size; row++){    
        		for (col = 0; col < size; col++){  
                		int n = matrix[row][col];  
                		if(n < 10)  
                    		System.out.print(n +" ");  
                		else  
                    		System.out.print(n +" ");  
        		}  
        		System.out.println();  
    		}  
	}  
	public static void main(String args[]){  
		int size = 5;  
		System.out.println("Spiral Matrix or Pattern is: \n");  
		printSpiralPattern(size);  
	}
}