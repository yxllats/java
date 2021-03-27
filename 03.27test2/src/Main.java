import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>0){
            int m = in.nextInt();
            String s = in.next();
            boolean flag = fun(s,m);
            if(!flag){
                toMin(s,m);
            }
            n--;
        }
    }
    public static boolean fun(String string,int len){
        int left = 0;
        int right = len - 1;
        int count = 0;
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        while (left<right){
            char chleft = string.charAt(left);
            char chright = string.charAt(right);
            if(chleft!=chright){
                count++;
                if(count>1){
                    return false;
                }
                if(chleft<chright){
                    stringBuffer1.append(chleft);
                    stringBuffer2.append(chleft);
                }else {
                    stringBuffer1.append(chright);
                    stringBuffer2.append(chright);
                }
            }else {
                stringBuffer1.append(chleft);
                stringBuffer2.append(chright);
            }
            left++;
            right--;
        }
        if(left==right){
            stringBuffer1.append(string.charAt(left));
        }
        System.out.print(stringBuffer1);
        System.out.println(stringBuffer2.reverse());
        return true;
    }
    public static void toMin(String s,int len){
        int count = 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            if(count>0&&s.charAt(i)>'0'){
                stringBuffer.append('0');
                count = 0;
            }else {
                stringBuffer.append(s.charAt(i));
            }
        }
        System.out.println(stringBuffer);
    }

}
