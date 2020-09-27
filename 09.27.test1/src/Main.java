import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        while (sum>0){
            int N = in.nextInt();
            int[][] arr = getArray(N);
            int M = in.nextInt();
            for (int i = 0; i < M; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                System.out.println(arr[x ][y ]);
            }
            sum--;
        }
    }
    public static int[][] getArray(int n){
        int k = 1;
        int a = 1;
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int start_X = 0;
        int end_X = n-1;
        int start_Y = 0;
        int end_Y = n-1;
        while (start_X<=end_X&&start_Y<=end_Y){
            if(start_X==end_X&&start_Y==end_Y){
                arr[start_X][start_Y] = k;
            }
            if(a==1){
                for (; y < end_Y; y++) {
                    arr[start_X][y] = k++;
                }
                for (; x < end_X; x++) {
                    arr[x][end_Y] = k++;
                }
                for (; y > start_Y; y--) {
                    arr[end_X][y] = k++;
                }
                for (; x > start_X; x--) {
                    arr[x][start_Y] = k++;
                }
                x++;
                y++;
            }else {
                for (; x < end_X; x++) {
                    arr[x][start_Y] = k++;
                }
                for (; y < end_Y; y++) {
                    arr[end_X][y] = k++;
                }
                for (; x > start_X; x--) {
                    arr[x][end_Y] = k++;
                }
                for (; y > start_Y; y--) {
                    arr[start_X][y] = k++;
                }
                x++;
                y++;
            }
            start_X++;
            end_X--;
            start_Y++;
            end_Y--;
            a*=-1;
        }
        return arr;
    }
}
