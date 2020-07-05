import java.math.BigInteger;
        import java.util.Scanner;

        import static java.lang.Integer.parseInt;

/**
 * Author: dts
 * DateTime: 2020/6/30 21:33
 * Description: TODO
 */
public class Main {
    public static void fun(String s){
        int index = 0;
        StringBuilder stringBuff = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='.'){
                String string = Integer.toBinaryString(parseInt(s.substring(index, i)));
                index = i+1;
                StringBuilder stringBuffer = new StringBuilder();
                stringBuffer.append(string);
                while (stringBuffer.length()<8){
                    stringBuffer.insert(0,'0');
                }
                stringBuff.append(stringBuffer);
            }
        }
        String string = Integer.toBinaryString(parseInt(s.substring(index, s.length())));
        if(string.length()==8){
            stringBuff.append(string);
        }else {
            int ind = string.length();
            while (ind!=8){
                stringBuff.append('0');
                ind++;
            }
            stringBuff.append(string);
        }
        //System.out.println(stringBuff);
        //System.out.println(stringBuff.length());
        BigInteger bi = new BigInteger(stringBuff.toString(), 2);	//转换为BigInteger类型
        System.out.println(bi);
        //System.out.println(parseInt(bi.toString()));

    }

    public static void fun_(String s){
        BigInteger n = new BigInteger(String.valueOf(s));	//转换成BigInteger类型
        String string = n.toString(2);
        StringBuilder stringBuff = new StringBuilder();
        int len = string.length();
        while (len <32){
            stringBuff.insert(0,'0');
            len++;
        }
        stringBuff.append(string);
        int index = 0;
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            stringBuffer.append(parseInt(stringBuff.toString().substring(index, i * 8), 2));
            index = i*8;
            stringBuffer.append('.');
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        System.out.println(stringBuffer.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String s2 = in.nextLine();
            fun(s);
            fun_(s2);

        }
    }
}
