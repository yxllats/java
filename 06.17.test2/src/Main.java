import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/17 23:33
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        while (in.hasNext()) {
            int n = in.nextInt();
            int sum = 0;
            if(n!=0){

                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                int num = in.nextInt();

                for (int x:arr) {
                    if(num == x){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
