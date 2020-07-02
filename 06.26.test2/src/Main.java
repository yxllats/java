import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/26 20:02
 * Description: TODO
 */
public class Main {
    public static int fun(int x,int y){
        int c = x%y;
        while (c!=0){
            x = y;
            y = c;
            c = x%y;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int a = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if(arr[i]<=a){
                    a+=arr[i];
                }else {
                    a+=fun(arr[i],a);
                }
            }
            //System.out.println();
            System.out.println(a);
        }
    }
}
