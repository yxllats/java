import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/7 20:11
 * Description: TODO
 */
public class Main {
    public static int func(int x,int y){
        int n=0;
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(arr[i][j]==0){
                    n++;
                    if(i+2<x) {
                        arr[i + 2][j] = -1;
                    }
                    if(j+2<y) {
                        arr[i][j + 2] = -1;
                    }
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNext()){
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(func(m, n));
        //}
    }
}
