/**
 * Author: dts
 * DateTime: 2020/6/22 14:57
 * Description: TODO
 */
public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] booleans = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(s.contains(p[i])){
                booleans[i] = true;
            }else {
                booleans[i] = false;
            }
        }
        return  booleans;
    }
}
