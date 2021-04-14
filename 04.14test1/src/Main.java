import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if(s1.equals("0")||s2.equals("0")){
            System.out.println("0");
            return;
        }
        int[] arr = new int[s1.length()+s2.length()];
        for (int i = s2.length() - 1; i >= 0; i--) {
            for (int j = s1.length()-1; j >= 0; j--) {
                int temp = (s1.charAt(j)-'0')*(s2.charAt(i)-'0');
                arr[i+j+1]+=temp;//最多 多出一位0
            }
        }
        int num= 0;
        //模十 取个位，除以十 取高位
        for (int i = s1.length()+s2.length() - 1; i >= 0 ; i--) {
            int temp = (arr[i]+num)%10;
            num = (arr[i]+num)/10;
            arr[i] = temp;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if(arr[0]!=0){
            stringBuffer.append(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            stringBuffer.append(arr[i]);
        }
        System.out.println(stringBuffer.toString());
    }

}
