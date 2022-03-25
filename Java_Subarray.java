import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// 5
// 1 -2 4 -5 1

public class Java_Subarray {
	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
			if( array[i] < 0 ){
    			sum = sum + 1;	
    		}
        }
    	for(int i = 1; i < size; i++ ){
    		for(int end = 0; end < size - i; end++){
    			int slice = end + i + 1 ;
    			int sumprov = 0;
    			int[] newArray = Arrays.copyOfRange(array, end, slice);
				System.out.println(Arrays.toString(newArray));    			
				for(int j = 0; j < newArray.length; j++){
    				sumprov = newArray[j] + sumprov;
    			}
    			if( sumprov < 0 ){
    				sum = sum + 1;	
    			}
    		}
    	}
    	//System.out.println(sum);    			
    }
}