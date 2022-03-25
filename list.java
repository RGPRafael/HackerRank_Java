import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class list {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		List<Integer> list=new ArrayList<Integer>();  
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		for(int i = 0; i < n; i++){
			int number =  scanner.nextInt();
			list.add(number);
		}
		int q = scanner.nextInt();
		for(int i = 0; i < q ; i++){
			String s = scanner.next();
			if(s.equals("Insert")){
				int index = scanner.nextInt();
				int value = scanner.nextInt();
				list.add(index, value);
			}
			//System.out.println(s);
			if(s.equals("Delete")) {
				//System.out.print("entrou");
				int index = scanner.nextInt();
				list.remove(index);
			}
		}
		for(Integer i:list){
			System.out.printf("%d ", i);

		}

    }
}