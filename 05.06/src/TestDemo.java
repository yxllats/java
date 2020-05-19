/**
 * Author: dts
 * DateTime: 2020/5/6 20:43
 * Description: TODO
 */
public class TestDemo {
    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            char[] ch = str.toCharArray();
            if(ch[i]<'0'||ch[i]>'9'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "12345a6";
        boolean flg = func(str);
        System.out.println(flg);
    }
}
