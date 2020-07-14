import java.util.*;

public class Main {
    public static boolean fun(PriorityQueue<Integer> queue,int n){

        if(n<3){
            return false;
        }
        int sum = 0;
        for(int i:queue){
            sum+=i;
        }
        if(sum<=2*queue.peek()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int opera = in.nextInt();
                int num = in.nextInt();
                if(opera==1){
                   queue.offer(num);
                }else {
                    queue.remove(num);
                }
                if(fun(queue,i+1)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
}
