import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/5/9 15:24
 * Description: TODO
 */
public class TestDemo {
    public static void my_Split(String string, String str, int n) {
        if (string.contains(str)) {
            for (int i = 0; i < n-1; i++) {
                int num = string.indexOf(str);
                System.out.println(string.substring(0, num));
                string = string.substring(num + 1);
            }
            System.out.println(string.substring(0));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int num = string.indexOf(",");
       // String str = string.substring(0, num);
       // System.out.println(str);
        my_Split("abc,abc,abc", ",", n );
    }
}