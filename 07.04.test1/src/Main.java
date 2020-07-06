import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/4 12:31
 * Description: TODO
 */
public class Main {
    public static void fun(char ch){
        String string = Integer.toBinaryString((int)ch);
        int n = 0;
        for (char cha :string.toCharArray()) {
            if(cha=='1'){
                n++;
            }
        }
        StringBuilder stringBuffer = new StringBuilder(string);
        while (stringBuffer.length()<7){
            stringBuffer.insert(0,'0');
        }
        if(n%2==0){
            stringBuffer.insert(0,'1');
        }else {
            stringBuffer.insert(0,'0');
        }
        System.out.println(stringBuffer);
    }
    public static void main(String[] args) {
        //System.out.println((int)'a');
        //System.out.println(Integer.toBinaryString((int)'a'));
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            for (int i = 0; i < string.length(); i++) {
                fun(string.charAt(i));
            }
        }
    }
}
