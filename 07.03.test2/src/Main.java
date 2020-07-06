import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/3 20:32
 * Description: TODO
 */
public class Main {
    public static void fun(int[] arr,int n,int sum){
        long[][] array = new long[n+1][sum+1];
        for (int i = 0; i <= n; i++) {
            array[i][0] = 1;
        }
        for (int i = 1; i <= sum; i++) {
            array[1][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum ; j++) {
                if(arr[i]>j){
                    array[i][j] = array[i-1][j];
                }else {
                    array[i][j] = array[i-1][j]+array[i-1][j-arr[i]];
                }
            }
        }
        System.out.println(array[n][sum]);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int sum = in.nextInt();
            int[] arr = new int[n+1];
            arr[0] = 0;
            for (int i = 1; i <= n ; i++) {
                arr[i] = in.nextInt();
            }
            fun(arr,n,sum);
        }
    }
}
