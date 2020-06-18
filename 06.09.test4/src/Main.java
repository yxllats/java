import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/9 19:57
 * Description: TODO
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(), res = 0;
            for (int i = 5; i <= n; i *= 5) {
                res += n / i;
            }
            System.out.println(res);
        }
    }
}