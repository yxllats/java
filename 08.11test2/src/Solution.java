public class Solution {
    public int numDistinct (String S, String T) {
        // write code here
        int m = S.length();
        int n = T.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) {
                if(S.charAt(i-1)==T.charAt(j-1)){
                    dp[j] = dp[j]+dp[j-1];
                }
            }
        }
        return dp[n];
    }
}
