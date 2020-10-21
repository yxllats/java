import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        boolean flag = true;
        long m = (long)Math.pow(2,64);
        if (n <= 0 || n>= m) {
            System.out.println(false);
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
