import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/22 13:56
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int[] max = new int[3];
        int i = 0;
        int j = 0;

        while (in.hasNext()) {
            String string = in.nextLine();
            int n = in.nextInt();

            for (i = 0; i < n; i++) {
                if (string.charAt(i) == 'G' || string.charAt(i) == 'C') {
                    sum++;
                }
            }
            max[0] = i - n;
            max[1] = i;
            max[2] = sum;
            sum = 0;


            for (i = 1; i < string.length() - n; i++) {
                for (j = i; j < i + n; j++) {
                    if (string.charAt(j) == 'G' || string.charAt(j) == 'C') {
                        sum++;
                    }
                }
                if (sum > max[2]) {
                    max[0] = j - n;
                    max[1] = j;
                    max[2] = sum;
                    sum = 0;
                } else {
                    sum = 0;
                }
            }


            System.out.println(string.substring(max[0], max[1]));
        }
    }
}
