import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/3 10:01
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuffer str = new StringBuffer();


        for (int i = 0; i < string.length(); i++) {
            int j = i;
            while(i<string.length()&&string.charAt(i)<=57&&string.charAt(i)>=48){
                str.append(string.charAt(i));
                i++;
            }
            if(i>j){
                queue.add(str.toString());
                str.delete(0,i);
            }
        }
        System.out.println(queue.peek());
    }
}
