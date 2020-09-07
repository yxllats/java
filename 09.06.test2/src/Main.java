import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] an = new int[n];
        int[] bn = new int[n];

        for (int i = 0; i < n; i++) {
            an[i] = in.nextInt();
        }


        for (int i = 0; i < n; i++) {
            bn[i] = an[i];
            for (int j = 1; j <= n; j++) {
                bn[i] = bn[i]^((i+1)%j);
            }
            //System.out.println(bn[i]);
        }

        int ans = bn[0];
        for (int i = 1; i < n; i++) {
            ans = ans^bn[i];
        }
        System.out.println(ans);
    }
}
