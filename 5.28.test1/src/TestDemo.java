import java.util.HashSet;

/**
 * Author: dts
 * DateTime: 2020/5/28 19:08
 * Description: TODO
 */
public class TestDemo {
        public int numJewelsInStones(String J, String S) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < J.length(); i++) {
                set.add(J.charAt(i));
            }
            int num = 0;
            for (int i = 0; i < S.length(); i++) {
                if(set.contains(S.charAt(i))) {
                    num++;
                }
            }
            return num;
        }
}
