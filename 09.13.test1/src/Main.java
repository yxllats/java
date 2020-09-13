
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if(string==null||string.length()==0){
            System.out.println(0);
            return;
        }
        Set<Character> set = new HashSet<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(set.add(string.charAt(i))){
                count++;
            }else {
                queue.offer(count);
                count = 0;
            }
        }
        if(count!=0){
            queue.offer(count);
        }
        System.out.println(queue.poll());
    }
}
