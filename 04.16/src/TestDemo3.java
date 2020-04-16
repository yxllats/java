/**
 * Author: dts
 * DateTime: 2020/4/16 15:53
 * Description: 二分查找
 */
public class TestDemo3 {
    public static  int binarySearch(int[] arr,int n) {
        int left=0;
        int right=arr.length-1;
        while(left<=right) {
           int mid = (left+right)/2;
            if(arr[mid]<n) {
                left=mid+1;
            }else if(arr[mid]>n) {
                right=mid-1;
            }else {
                return mid;
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int num=binarySearch(array,10);
        System.out.println(num);
    }
}
