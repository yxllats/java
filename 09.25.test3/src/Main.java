import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        for (int i = 1; i < 5; i++) {
            String string = new String();
            ff(i,string,priorityQueue);
        }
        while (priorityQueue.size()>1){
            System.out.print(priorityQueue.poll()+" ");
        }
        System.out.print(priorityQueue.poll());
    }
    public static void ff(int n,String string,PriorityQueue<String> priorityQueue){

        string+=n;


        if(string.length()==3){
            priorityQueue.offer(string);
            return;
        }
        for (int i = 1; i < 5; i++) {
            if(n==i){
                continue;
            }
            if(string.contains(String.valueOf(i))){
                continue;
            }
            ff(i,string,priorityQueue);
        }
    }
}
