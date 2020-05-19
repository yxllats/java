import java.util.ArrayList;
import java.util.List;

/**
 * Author: dts
 * DateTime: 2020/5/14 16:28
 * Description: TODO
 */
public class TestDemo {
    public static String func(String str1,String str2) {
        StringBuffer stringbuffer = new StringBuffer();
        char[] ch = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(ch[i]+"")){
                stringbuffer.append(ch[i]);
            }
        }
        String str = stringbuffer.toString();
        return str;
    }
    public static void main(String[] args) {
        String string1 = "welcome to bit";
        String string2 = "come";
        String string = func(string1,string2);
        System.out.println(string);
    }
}
