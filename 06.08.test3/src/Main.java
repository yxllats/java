import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/6/8 21:13
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (in.hasNext()){
            stack.push(in.nextInt());
        }


        int k = stack.pop();
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        for (int i = 0; i < k; i++) {
            System.out.print(queue.poll()+" ");
        }
    }
}
