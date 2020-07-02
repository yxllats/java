import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/25 20:37
 * Description: TODO
 */
public class Main {
    public static void fun(int[] arr){
        int sum0 = 0;
        int n0 = 0;


        ArrayList<Integer> list1 = new ArrayList<>();
        int sum1 = 0;
        int n1 = 0;

        int n2 = 0;
        int sum3 = 0;
        int n3 = 0;

        int max4 = 0;
        int n4 = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i]%5;
            switch (n){
                case 0:
                    if(arr[i]%10==0){
                        sum0 += arr[i];
                        n0++;
                    }
                    break;
                case 1:
                    list1.add(arr[i]);
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    sum3 += arr[i];
                    n3++;
                    break;
                case 4:
                    if(arr[i]>max4){
                        max4 = arr[i];
                        n4++;
                    }
            }
        }
        Iterator<Integer> it = list1.iterator();
        int k = 1;
        while (it.hasNext()){
            sum1= sum1 + it.next()*k;
            k*=-1;
        }
        if(n0>0) {
            System.out.print(sum0 + " ");
        }else {
            System.out.print("N"+" ");
        }

        if(n1>0) {
            System.out.print(sum1+" ");
        }else {
            System.out.print("N"+" ");
        }

        if(n2>0) {
            System.out.print(n2+" ");
        }else {
            System.out.print("N"+" ");
        }

        if(n3>0) {
            DecimalFormat df=new DecimalFormat("0.0");//设置保留位数

            System.out.print(df.format((float) sum3 / n3)+" ");
        }else {
            System.out.print("N"+" ");
        }

        if(n4>0) {
            System.out.print(max4);
        }else {
            System.out.print("N");
        }


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            fun(arr);
        }
    }
}
