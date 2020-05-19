import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

/**
 * Author: dts
 * DateTime: 2020/5/9 21:58
 * Description: TODO
 */
public class TestDemo {
    public static boolean contains(String string1,String string2) {
        char[] ch1 = string1.toCharArray();
        char[] ch2 = string2.toCharArray();
        int i = 0;
        int j = 0;
        for ( i = 0; i < string1.length(); i++) {
            for (j = 0; j < string2.length(); j++) {
                if(ch2[j]==ch1[i]) {
                    i++;
                }else {
                    i--;
                    break;
                }
            }
            if(j<ch2.length) {
                j = 0;
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String string1 = "abcabcd";
        String string2 = "abcd";
        System.out.println(contains(string1, string2));
    }
}
