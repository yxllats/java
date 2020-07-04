import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/30 21:20
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(in.nextInt(),i);
            }
            int num = in.nextInt();
            if(map.containsKey(num)){
                System.out.println(map.get(num));
            }else {
                System.out.println("-1");
            }
        }
    }
}
