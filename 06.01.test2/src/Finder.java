/**
 * Author: dts
 * DateTime: 2020/6/1 12:45
 * Description: TODO
 */
public class Finder {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        System.out.println(findKth(a, 5, 3));
    }

    public static int partition(int[] array,int low,int high) {
        int tmp = array[low];
        while (low < high) {
            while (low<high&& array[high]>=tmp) {
                high--;
            }
            array[low] = array[high];
            while (low<high&&array[low]<=tmp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }


    public static void quick(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        three_num_mid(arr,left,right);
        int mid = partition(arr,left,right);
        quick(arr,0,mid-1);
        quick(arr,mid+1,right);
    }

    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[right]
        int mid = (left+right)/2;
        if(array[left] > array[right]) {
            swap(array,left,right);
        }
        if(array[mid] > array[left]) {
            swap(array,left,mid);

        }
        if(array[mid] > array[right]) {
            swap(array,mid,right);
        }
    }
    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    public static  int findKth(int[] a, int n, int K) {
        quick(a,0,a.length-1);
        return a[n-K];
    }
}
