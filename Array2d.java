import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int maxi=-100000;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i<=3 && j<=3){
                    int topLine    = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                    int bottomLine = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    int middle     = (arr[i+1][j+1]);
                    int sum= topLine + middle + bottomLine;
                    if(sum>maxi) maxi=sum;
                }
            }
        }
        System.out.println(maxi);

    }

}

