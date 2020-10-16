public class Solution {
    public static void main(String[] args) {

    }
    public int[] func1 (int[][] order_list, int n) {
        // write code here
        int[] array = new int[n];
        for (int i = 0; i < order_list.length; i++) {
            int start = order_list[i][0];
            int end = order_list[i][1];
            int k = order_list[i][2];
            for (int j = start; j <= end; j++) {
                array[j] += k;
            }
        }
        return array;
    }
}
