import java.util.HashSet;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/3 19:28
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while(scanner.hasNext()){
            set.add(scanner.next());
        }
        System.out.println(set.size());
    }
}
