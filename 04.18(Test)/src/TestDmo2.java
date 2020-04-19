/**
 * Author: dts
 * DateTime: 2020/4/18 15:48
 * Description: 数组奇数前置偶数后置
 */
public class TestDmo2 {
    public static int[] swapNum(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            while(left<right && arr[left]%2!=0) {
                left++;
            }
            while(left<right && arr[right-1]%2==0) {
                right--;
            }
            if(left<right && arr[left]%2==0 & arr[right-1]%2!=0) {
                int temp = arr[left];
                arr[left] = arr[right-1];
                arr[right-1] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array={1,2,1,2,1,2};
        int[] ret=swapNum(array);
        for (int var : ret) {
            System.out.print(var+" ");
        }
    }
}