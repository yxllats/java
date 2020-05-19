/**
 * Author: dts
 * DateTime: 2020/5/9 20:28
 * Description: TODO
 */
public class TestDemo {
    public static int compareTo(String string1,String string2){
        byte[] data1 = string1.getBytes();
        byte[] data2 = string2.getBytes();
        //默认长度长的是第一个字符串
        for (int i = 0; i < data1.length; i++) {
            if(data1[i]>data2[i]) {
                return 1;
            }else if(data1[i]<data2[i]) {
                return -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "abd";
        System.out.println(compareTo(string1, string2));

    }
}
