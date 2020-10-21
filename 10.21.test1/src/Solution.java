public class Solution {
    public static void main(String[] args) {

    }
    public int countBit (int n) {
        // write code here
        int sum = 0;
        while (n>0){
            sum++;
            n = n&(n-1);
        }
        return sum;
    }
}
