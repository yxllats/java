public class Main {
    public int NumberOf1Between1AndN_Solution(int n) {
        /**
         *1.如果x > 1的话，则第i位数上包含的1的数目为：
                   (高位数字 + 1）* 10 ^ (i-1) (其中高位数字是从i+1位一直到最高位数构成的数字)
         *2.如果x < 1的话，则第i位数上包含的1的数目为：
                   (高位数字 ）* 10 ^ (i-1)
         *3.如果x == 1的话，则第i位数上包含1的数目为：
                   (高位数字) * 10 ^ (i-1) +(低位数字+1) (其中低位数字时从第i - 1位数一直到第1位数构成的数字)
         */
        int AA = 0;
        int BB = 0;
        int sum = 0;
        for (int m = 1; m <= n; m *= 10) {
            AA = n / m;
            BB = n % m;
            sum += (AA + 8) / 10 * m + (AA % 10 == 1 ? BB + 1 : 0);
        }
        return sum;
    }
}
