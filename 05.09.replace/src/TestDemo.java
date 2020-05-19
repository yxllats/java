/**
 * Author: dts
 * DateTime: 2020/5/9 20:11
 * Description: TODO
 */
public class TestDemo {
    public static  String my_replace(String string,char ch1,char ch2){
        char[] ch = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(ch[i] == ch1) {
                ch[i] = ch2;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String string1 = "abcdabcd";
        String string = my_replace(string1,'a','h');
        System.out.println(string);
    }
}
