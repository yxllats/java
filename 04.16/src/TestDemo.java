import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Author: dts
 * DateTime: 2020/4/16 13:43
 * Description: 冒泡排序
 */
public class TestDemo {
    public static int[] bubble_Sort(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            int count=0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                count++;
            }
            if(count==0) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array={3,2,5,1,6,9,8};
        int[] ret=bubble_Sort(array);
        System.out.println(Arrays.toString(ret));
        /*for (int var: ret) {
            System.out.print(var+" ");
        }*/
    }
}
