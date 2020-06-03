import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Author: dts
 * DateTime: 2020/5/30 22:58
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        MaxHeap.add(23);
        MaxHeap.add(10);
        MaxHeap.add(3);
        MaxHeap.add(50);
        MaxHeap.add(66);
        System.out.println(MaxHeap.peek());
        System.out.println(MaxHeap.poll());
        System.out.println(MaxHeap.peek());
        System.out.println(MaxHeap.poll());
        System.out.println(MaxHeap.peek());
        System.out.println(MaxHeap.poll());
    }
}
