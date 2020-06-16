import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/8 20:49
 * Description: TODO
 */
public class Main {
    public static int fun(int n){
        int count = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        while (queue.size()>1){
            if(count++%3==0){
                queue.poll();
                count=1;
            }else {
                queue.offer(queue.poll());
            }
        }
        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(fun(n));
        }
    }
}
