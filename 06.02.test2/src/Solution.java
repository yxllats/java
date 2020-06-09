/**
 * Author: dts
 * DateTime: 2020/6/2 13:24
 * Description: TODO
 */
public class Solution {
    public static int count(int[] A, int n) {
        // write code here
        return Num_sum(A,0);
    }
    public static int Num_sum(int[] arr,int start){
        if(start >= arr.length){
            return 0;
        }


        int min = arr[start];
        int index = start;


        for (int i = start; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return (index-start)+Num_sum(arr,index+1);
    }

    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,0,1};
        System.out.println(count(A, 8));
    }
}
