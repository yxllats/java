import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            String string = in.nextLine();
            String[] strings = string.split(" ");
            for (int i = 0; i < strings.length - 1; i++) {
                queue.offer(Integer.valueOf(strings[i]));
            }
            int k = Integer.valueOf(strings[strings.length-1]);
            while (k>1){
                k--;
                System.out.print(queue.poll()+" ");
            }
            System.out.println(queue.poll());
        }
    }
}
