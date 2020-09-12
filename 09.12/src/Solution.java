public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * M包糖果，抛M次硬币，硬币连续n次为正面，最多能得到多少颗糖果
     * @param candies int整型一维数组 每包糖果的数量
     * @param coin int整型一维数组 抛硬币的结果
     * @param n int整型 连续是正面的次数
     * @return int整型
     */
    public int maxCandies (int[] candies, int[] coin, int n) {
        // write code here
        int len = candies.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if(coin[i]==0){
                sum+=candies[i];
                candies[i] = 0;
            }
        }
        int sum_n = 0;
        int temp = 0;
        if(n>0&&n<len) {
            for (int i = 0; i < len - n + 1; i++) {
                int index = n;
                while (index > 0){
                    temp += candies[i + index -1];
                    index--;
                }
                if(sum_n<temp){
                    sum_n = temp;
                }
                temp = 0;
            }
        }else if(n>=len){
            for (int i = 0; i < len; i++) {
                sum_n += candies[i];
            }
        }
        return sum+sum_n;
    }
}