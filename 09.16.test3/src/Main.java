import java.util.Scanner;

public class Main {
    public static String getNum(String stdin){
        String[] strings = stdin.split("#");
        StringBuffer stringBuffer1 = new StringBuffer(strings[0]);
        StringBuffer stringBuffer2 = new StringBuffer(strings[1]);
        int len1 = stringBuffer1.length();
        int len2 = stringBuffer2.length();
        if(len1>len2){
            int len = len1 - len2;
            while (len>0) {
                stringBuffer2.insert(0, '0');
                len--;
            }
        }else if(len2>len1){
            int len = len2 - len1;
            while (len>0) {
                stringBuffer1.insert(0, '0');
                len--;
            }
        }
        int temp = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = stringBuffer1.length() - 1;i>=0; i--) {
            int n1 = stringBuffer1.charAt(i) - '0';
            int n2 = stringBuffer2.charAt(i) - '0';
            if(n1+n2+temp>9){
                int n = n1+n2-10+temp;
                temp = 1;
                stringBuffer.insert(0,n);
            }else {
                int n = n1+n2+temp;
                temp = 0;
                stringBuffer.insert(0,n);
            }
        }
        if(temp == 1){
            stringBuffer.insert(0,'1');
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stdin = in.nextLine();
        String stdout = getNum(stdin);
        System.out.println(stdout);
    }
}