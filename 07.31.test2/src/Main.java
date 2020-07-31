public class Main {
    public static int minPathSum (int[][] grid) {
        // write code here
        int[] dp = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            if(i==0){
                dp[i] = grid[0][i];
            }else {
                dp[i] = dp[i-1]+grid[0][i];
            }
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(j==0){
                    dp[j] += grid[i][j];
                }else {
                    dp[j] =Math.min(dp[j],dp[j-1])+grid[i][j];
                }
            }
        }
        return dp[grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,5},{3,2,1}};
        System.out.println(minPathSum(arr));
    }
}
