import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse());
    }
}
