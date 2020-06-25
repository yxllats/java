import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/15 21:41
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        while (in.hasNext()) {
            for (int i = 0; i < 10; i++) {
                int n = in.nextInt();
                while (n != 0) {
                    priorityQueue.offer(i);
                    n--;
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        while (priorityQueue.size()!=0&&priorityQueue.peek()>0){
            stringBuffer.insert(0,priorityQueue.poll());
        }
        while (priorityQueue.size()!=0){
            stringBuffer.insert(1,priorityQueue.poll());
        }
        System.out.println(stringBuffer.toString());
    }
}
