package Strings;

import java.io.*;
import java.util.*;

public class StringPalindromo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int end = A.length() - 1;
        char[]c = A.toCharArray();
        String ansyer = "Yes";
        for(int i = 0; i < A.length(); i++){
            if( c[i] == c[end]){
                end = end - 1;
            }
            else if( i == end){
                break;
            }
            else{
                ansyer = "No";
                break;
            }
        }
        System.out.print(ansyer);
        
        
    }
}



