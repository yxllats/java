import java.util.PriorityQueue;

/**
 * Author: dts
 * DateTime: 2020/5/22 18:19
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {4,1,9,2,8,0,7,3,6,5};
        // 一般在创建优先级队列对象时，如果知道元素个数，建议就直接将底层容量给好
        // 否则在插入时需要不多的扩容
        // 扩容机制：开辟更大的空间，拷贝元素，这样效率会比较低
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
        for (int e: arr) {
            q.offer(e);
        }
        System.out.println(q.size()); // 打印优先级队列中有效元素个数
        System.out.println(q.peek()); // 获取优先级最高的元素
        // 从优先级队列中删除两个元素之和，再次获取优先级最高的元素
        q.poll();
        q.poll();
    }
}
