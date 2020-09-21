public class Solution {
    public int[] countBits (int num) {
        // write code here
        int[] arr = new int[num+1];
        for (int i = 0; i < num+1; i++) {
            int k = i;
            while(k>0){
                k = k&(k-1);
                arr[i]++;
            }
        }
        return arr;
    }
}
