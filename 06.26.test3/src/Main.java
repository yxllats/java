import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/26 20:29
 * Description: TODO
 */
public class Main {
    public static void fun(char ch,int start,int end,int[] arr){
        if(ch=='Q') {
            int max = 0;
            if(start>end){
                start = end + start;
                end = start - end;
                start = start - end;
            }
            for (int i = start-1; i < end; i++) {
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }else {
            arr[start-1] = end;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int opera = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            for (int i = 0; i < opera; i++) {
                char ch = in.next().charAt(0);
                int a = in.nextInt();
                int b = in.nextInt();
                fun(ch,a, b, array);
            }
        }
    }
}
