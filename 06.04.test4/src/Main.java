import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/4 22:20
 * Description: TODO
 */
public class Main {
    public static int func(int sum,int[] arr,int x){
        if(sum==40){
            return 1;
        }
        if(sum>40||x>arr.length-1){
            return 0;
        }
        return func(sum+arr[x],arr,x+1)+func(sum,arr,x+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ay = new int[n];
        for (int i = 0; i < n; i++) {
            ay[i] = scan.nextInt();
        }
        System.out.println(func(0, ay, 0));
    }
}
