import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            if (str1 == null || str1.length() == 0) {
                System.out.println();
                return;
            }
            if (str2 == null || str2.length() == 0) {
                System.out.println(str1.toUpperCase());
            }
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str2.length(); i++) {
                set.add(str2.charAt(i));
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str1.length(); i++) {
                if (set.add(str1.charAt(i))) {
                    stringBuffer.append(str1.charAt(i));
                }
            }
            String string = stringBuffer.toString();
            System.out.println(string.toUpperCase());
        }
    }
}