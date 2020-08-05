public class Main {
    public int backPackII(int m, int[] A, int[] V) {
        // write your code here
        int num = A.length-1;
        int[] dp = new int[m+1];

        for (int i = 1; i <= num; i++) {
            for (int j = m; j >0 ; j--) {
                if(A[i-1]<=j) {
                    dp[j] = Math.max(dp[j ], dp[j - A[i - 1]] + V[i - 1]);
                }
            }
        }
        return dp[m];
    }
}
