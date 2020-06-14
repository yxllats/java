import java.util.HashSet;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/3 22:05
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        for (char c:string2.toCharArray()) {
            set.add(c);
        }
        for (char c:string1.toCharArray()) {
            if(set.add(c)){
                System.out.print(c);
                set.remove(c);
            }
        }
    }
}
