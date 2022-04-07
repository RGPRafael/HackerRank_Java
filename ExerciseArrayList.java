import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseArrayList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int lines  = sc.nextInt();
        ArrayList<ArrayList> myArrayList = makingArrayList(lines);
        //System.out.println(myArrayList);
        int queries = sc.nextInt();
        int[][] queriesMade = MakingQueries(queries);
        for(int i = 0; i < queries; i++){
            ArrayList <Integer> l =  myArrayList.get(queriesMade[i][0] - 1);
            //System.out.println(queriesMade[i][0] + " " + queriesMade[i][1]);
            //System.out.println(l);
            if( l.size() >= queriesMade[i][1]){
                int answer = l.get(queriesMade[i][1] - 1);
                System.out.println(answer);
            }
            else{
                System.out.println("ERROR!");
            }
        }

    }

    public static ArrayList<ArrayList> makingArrayList(int lines){
        ArrayList<ArrayList> myArrayList = new ArrayList<>(lines);
        for(int i = 0; i < lines; i++){
            int numbers = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for(int j = 0; j < numbers; j++) {
                int number = sc.nextInt();
                array.add(number);
            }
            myArrayList.add(array);
        }
        return myArrayList;
    }
    public static int[][] MakingQueries(int queries){
        int [][]question = new int[queries][2];
        for(int i = 0; i < queries; i++) {
            for (int j = 0; j < 2; j++) {
                question[i][j] = sc.nextInt();
            }
        }
        return question;
    }
}
