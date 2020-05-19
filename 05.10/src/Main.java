/**
 * Author: dts
 * DateTime: 2020/5/10 15:37
 * Description: TODO
 */
import java.util.*;

public class Main{
    public static String my_Del(String string){
       char[] ch = string.toCharArray();
       StringBuffer str = new StringBuffer();
        String string1 = str.toString();
        for (int i = 0; i < string.length(); i++) {
            string1 = str.toString();
            if(!string1.contains(ch[i]+"")){
                str.append(ch[i]);
            }
        }
        return string1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        String str = my_Del(string);
        System.out.println(str);
    }
}