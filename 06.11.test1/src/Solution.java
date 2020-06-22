/**
 * Author: dts
 * DateTime: 2020/6/11 20:28
 * Description: TODO
 */
public class Solution {
    static int n = 1;
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            n = 1;
            for (int j = 0; j < A.length; j++) {
                if(j!=i){
                    n*=A[j];
                }
            }
            B[i] = n;
        }
        return B;
    }
}