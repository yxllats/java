import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine().toUpperCase();
            String s2 = in.nextLine().toUpperCase();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s2.length(); i++) {
                set.add(s2.charAt(i));
            }
            for (int i = 0; i < s1.length(); i++) {
                if(set.add(s1.charAt(i))){
                    System.out.print(s1.charAt(i));
                }
            }
        }
    }
}
