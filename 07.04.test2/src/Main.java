import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/4 13:10
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = 0;
                if(o2.length()!=o1.length()) {
                    return o1.length() - o2.length();
                }else {
                    for (i = 0; i < o2.length(); i++) {
                        if(o2.charAt(i) !=o1.charAt(i)){
                            break;
                        }
                    }
                }
                return o1.charAt(i) - o2.charAt(i);
            }
        });
        Scanner in = new Scanner(System.in);
        //String[] str = in.nextLine().split(" ");
        //System.out.println(Arrays.toString(str));
        while (in.hasNext()){
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                String s = in.next();
                queue.offer(s);
            }
            while (queue.size()>0){
                System.out.println(queue.poll());
            }

        }
    }
}
