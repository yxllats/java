import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);
        System.out.println(Arrays.toString(set.toArray()));
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.remove(3);
        queue.remove(5);
        System.out.println(Arrays.toString(queue.toArray()));
    }
}
