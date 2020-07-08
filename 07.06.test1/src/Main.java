import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/6 21:28
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            String s2 = in.next();

            String[] sale = s.split("\\.");
            int[] sal = {Integer.parseInt(sale[0]), Integer.parseInt(sale[1]), Integer.parseInt(sale[2])};
            String[] pay_n = s2.split("\\.");
            int[] pay = {Integer.parseInt(pay_n[0]), Integer.parseInt(pay_n[1]), Integer.parseInt(pay_n[2])};
            int[] get = new int[3];

            StringBuffer stringBuffer = new StringBuffer();
            int m = 0;
            if (sal[0] > pay[0]) {
                m = 0;
            } else if (sal[0] < pay[0]) {
                m = 1;
            } else {
                if (sal[1] * 29 + sal[2] > pay[1] * 29 + pay[2]) {
                    m = 0;
                } else {
                    m = 1;
                }
            }

            if (m == 1) {
                get[2] = pay[2] - sal[2] ;

                if (get[2] < 0) {
                    get[2] = get[2] + 29;
                    pay[1] -= 1;
                }
                get[1] = pay[1] - sal[1];
                if (get[1] < 0) {
                    get[1] = get[1] + 17;
                    pay[0] -= 1;
                }
                get[0] = pay[0] - sal[0];
                System.out.println(get[0] + "." + get[1] + "." + get[2]);
            } else {
                get[2] = pay[2] - sal[2];
                if (get[2] > 0) {
                    get[2] = get[2] - 29;
                    pay[1] += 1;
                }
                get[1] = pay[1] - sal[1];
                if (get[1] > 0) {
                    get[1] = get[1] - 17;
                    pay[0] += 1;
                }
                get[0] = pay[0] - sal[0];
                System.out.println(get[0] + "." + get[1] * (-1) + "." + get[2] * (-1));
            }
            if ((sal[0] + sal[1] + sal[2]) == (pay[0] + pay[1] + pay[2])) {
                System.out.println("0.0.0");
            }
        }
    }
}
