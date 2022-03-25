import java.io.*;
import java.util.*;

public class Strings_introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        String answer = "No";
        if ( A.compareTo(B) > 0 ){
            answer = "Yes";
        } 
        //Character.toUpperCase(A[0]);
        char[]a = A.toCharArray();
        char[]b = B.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        b[0] = Character.toUpperCase(b[0]); 
        String a_c = new String(a);
        String b_c = new String(b);
        String C = a_c + " " + b_c;
        System.out.println(sum);
        System.out.println(answer);
        System.out.println(C);


    }
}



