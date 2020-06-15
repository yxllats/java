import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/6/5 20:54
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }else{
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>=map.size()/2){
                System.out.println(entry.getKey());
            }
        }

    }
}
