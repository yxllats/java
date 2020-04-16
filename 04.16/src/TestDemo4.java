/**
 * Author: dts
 * DateTime: 2020/4/16 16:06
 * Description: 数组拷贝
 */
public class TestDemo4 {
    public static int[] arrCopy(int[] arr,int n) {
        int[] arr1=new int[n];
        for (int i = 0; i < n ; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int[] ret=arrCopy(array,array.length);
        for (int var: ret) {
            System.out.print(var + " ");
        }
    }
}
