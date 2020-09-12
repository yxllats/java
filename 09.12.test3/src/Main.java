import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String string = in.nextLine();
            int n = Integer.parseUnsignedInt(string);
            int sum = 0;
        while (n!=0){
            n = n&(n-1);
            sum++;
        }

        System.out.println(sum);

    }
}
