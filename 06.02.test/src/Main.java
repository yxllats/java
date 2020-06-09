import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/2 10:24
 * Description: TODO
 */
public class Main {
    public static int Button_num(int n){
        if(n<2){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return n/3+Button_num(n/3+n%3);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        while (scan.hasNext()){
            int n = scan.nextInt();
            if(n==0){
                break;
            }
            queue.offer(Button_num(n));
        }
        Iterator<Integer> it=queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            //for (Queue b:queue) {
        }

    }
}
