import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/8 19:52
 * Description: TODO
 */
public class TestDmemo {
    public static String reverse(String str,int begin,int end) {
        char[] cha = new char[end];
        cha = str.toCharArray();
        while(begin <= end) {
            char temp = cha[begin];
            cha[begin] = cha[end];
            cha[end] = temp;
            begin++;
            end--;
        }
        return new String(cha);
    }
    public static void func(String str, int n) {
        String str1 = reverse(str,0,n-1);
        String str2 = reverse(str1,n,str.length()-1);
        String str3 = reverse(str2,0,str.length()-1);
        System.out.println(str3);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        func(str,n);
    }
}
