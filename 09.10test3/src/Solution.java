public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(array[mid]>array[left]){
                left = mid;
            }else if(array[mid]<array[left]){
                right = mid;
            }else{
                left++;
            }
        }
        return array[right];
    }
}