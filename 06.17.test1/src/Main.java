import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/17 22:21
 * Description: TODO
 */
public class Main {
    public static int[] func(int[] arr,int n){
        int[] array = new int[n+1];
        int index = n;
        int mid = n/2;
        int x = n-mid;

        while (x-->0){
            array[index--] = arr[n--];
            array[index--] = arr[mid--];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            while (n-->0){
                int x = in.nextInt();
                int[] array = new int[x*2];
                int k = in.nextInt();

                for (int i = 0; i <2*x ; i++) {
                    array[i] = in.nextInt();
                }
                while (k-->0){
                    array = Arrays.copyOf(func(array,x*2-1),2*x);
                }
                for (int i = 0; i < 2*x-1; i++) {
                    System.out.print(array[i]);
                    System.out.print(" ");
                }
                System.out.println(array[2 * x - 1]);
            }
        }
    }
}
