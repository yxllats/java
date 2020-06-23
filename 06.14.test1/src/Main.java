import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/14 20:59
 * Description: TODO
 */
public class Main {
    public static String AddLongInteger(String addend,String augend){
        if(addend.length()==0&&augend.length()==0){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        int index = addend.length() - 1;
        for (int i = augend.length()-1; i >= 0; i--) {
            int n = (augend.charAt(i)-'0') + (addend.charAt(index--)-'0') + count;
            if(n>9){
                count = 1;
                stringBuffer.insert(0,n-10);
            }else {
                stringBuffer.insert(0,n );
                count = 0;
            }
        }
        for (int i = index; i >= 0; i--) {
            int n = addend.charAt(i)-'0' + count;
            if(n>9){
                count = 1;
                stringBuffer.insert(0,n-10);
            }else {
                stringBuffer.insert(0,n );
                count = 0;
            }
        }
        if(count==1) {
            stringBuffer.insert(0,1 );
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        String string2 = in.nextLine();
        while (in.hasNext()) {
            if (string1.length() > string2.length()) {
                System.out.println(AddLongInteger(string1, string2));
            } else {
                System.out.println(AddLongInteger(string2, string1));
            }
        }
    }


}
