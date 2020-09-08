public class Main {
    /**
     * 计算有多少对符合条件的数对
     * @param a int整型一维数组 数组a
     * @param b int整型一维数组 数组b
     * @return int整型
     */
    public static int countLR (int[] a, int[] b) {
        int len = a.length;
        int[] sumarr = new int[len];
        sumarr[0] = a[0];
        int ret = 0;

        for(int i = 1;i<len;i++){
            sumarr[i] = sumarr[i-1] + a[i];
        }

        for(int r = 0;r<len;r++){
            for(int l = 0;l<=r;l++){

                if(sumarr[r] - sumarr[l] + a[l] ==   b[l] + b[r]){
                    ret++;
                    System.out.println(l+" "+r);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] aa = {1,2,3,4};
        int[] bb = {2,1,4,5};

        System.out.println(countLR(aa, bb));
    }
}