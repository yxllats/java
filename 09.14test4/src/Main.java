import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int temp = m;
        for (int i = 0; i < 3*n; i++) {
            sum += temp;
            temp += m;

        }
        System.out.println(sum);
    }
}
