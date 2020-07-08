/**
 * Author: dts
 * DateTime: 2020/7/7 9:25
 * Description: TODO
 */
public class Main {
    public static int countNumberOf2s(int n) {
        // write code here

        int ret = 0;
        for (int i = 0; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            if(stringBuffer.toString().contains("2")) {
                for (char ch : stringBuffer.toString().toCharArray()) {
                    if (ch == '2') {
                        ret++;
                    }
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(countNumberOf2s(10));
    }
}
