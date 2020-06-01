import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * Author: dts
 * DateTime: 2020/5/24 14:51
 * Description: TODO
 */
public class TestSort {
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

    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        int ret = partition(array,left,right);
        quick(array,left,ret-1);
        quick(array,ret+1,right);
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }


    public static void quickSort1(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length - 1;

        int par = partition(array, left, right);

        if (par > left + 1) {
            stack.push(array[left]);
            stack.push(array[par - 1]);
        }
        if (par < right - 1) {
            stack.push(array[par + 1]);
            stack.push(array[right]);
        }
        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par = partition(array, left, right);

            if (par > left + 1) {
                stack.push(left);
                stack.push(par - 1);
            }
            if (par < right - 1) {
                stack.push(par + 1);
                stack.push(right);
            }

        }
    }

    public static void mergeSort(int[] array) {
        mergeSortInt(array,0,array.length-1);
    }

    public static void mergeSortInt(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)>>>1;
        mergeSortInt(array, low, mid);
        mergeSortInt(array, mid+1,high);

        merge(array,low,mid,high);
    }


    public static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int s2 = mid+1;
        int size = high-low+1;
        int[] arrays = new int[size];
        int i = 0;
        while(s1<=mid&&s2<=high){
            if(array[s1]<array[s2]) {
                arrays[i++] = array[s1++];
            }else {
                arrays[i++] = array[s2++];
            }
        }
        while(s1<=mid){
            arrays[i++] = array[s1++];
        }
        while(s2<=high){
            arrays[i++] = array[s2++];
        }

        for (int j = 0; j < arrays.length; j++) {
            array[low+j] = arrays[j];
        }
    }

    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        //quickSort(array);
        //System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
