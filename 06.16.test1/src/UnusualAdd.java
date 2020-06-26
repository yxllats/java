/**
 * Author: dts
 * DateTime: 2020/6/16 22:52
 * Description: TODO
 */
public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        while (B>0){
            int n = A^B;
            int m = (A&B)<<1;
            A = n;
            B = m;
        }
        return A;
    }
}