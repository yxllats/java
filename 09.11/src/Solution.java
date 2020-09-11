public class Solution {
    public void reOrderArray(int [] array) {
        int left = 0;
        int index = 0;
        while(left<array.length){
            while(array[left]%2==0){
                left++;
                if(left==array.length){
                    return;
                }
            }

            int temp = array[left];
            for(int i = left;i>index;i--){
                array[i] = array[i-1];
            }
            array[index] = temp;
            index++;
            left++;
        }
    }
}