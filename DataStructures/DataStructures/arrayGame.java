package DataStructures.DataStructures;

import java.util.*;

public class arrayGame {
    // usar dfs ... 
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int move = 0;
        boolean possible = true;
        while(possible && move < game.length - 1){
            if(game[move + 1] == 0 ){
                move = move + 1;
            }
            else if((move + leap) < game.length && game[move + leap] == 0 ){
                move = move + leap;
            }
            else if((move + leap) < game.length && game[move + leap] == 1 ){
                //possible = false;
                if((move - 1 ) >= 0 && game[move - 1] == 0 ){
                    game[move] = 1;
                    move = move - 1;
                    
                }
                else{
                    possible = false;
                }

            }
            else if((move + leap) >= game.length ){
                move = move + leap;
            }
        }
        if (possible){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}