import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if(m<=0||n<=0){
            return;
        }
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        if(m==1||n==1){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(arr[i][j]);
                }
            }
            return;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0,j = k; i < m && j>=0; i++,j--) {
                System.out.print(arr[i][j]+",");
            }
        }
        for (int k = 1; k < m; k++) {
            for (int i = k,j = n - 1; i < m && j>=0; i++,j--) {

                if(i==(m-1)&&j==(n-1)){
                    System.out.print(arr[i][j]);
                }else {
                    System.out.print(arr[i][j]+",");
                }
            }
        }
    }
}
