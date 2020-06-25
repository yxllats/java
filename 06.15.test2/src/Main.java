import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/15 22:08
 * Description: TODO
 */
public class Main {
    public static String GetSequeOddNum(int m){
        StringBuffer stringBuffer = new StringBuffer();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        int temp = (int)Math.pow(m,3)/m;
        int i = 0;
        if(temp%2==0){
            while (m>0){
                priorityQueue.offer(temp-1-2*i);
                priorityQueue.offer(temp+1+2*i);
                m-=2;
                i++;
            }
        }else {
            i = 1;
            priorityQueue.offer(temp);
            m--;
            while (m>0){
                priorityQueue.offer(temp-2*i);
                priorityQueue.offer(temp+2*i);
                m-=2;
                i++;
            }
        }

        while (priorityQueue.size()>1){
            stringBuffer.append(priorityQueue.poll()+"+");
        }
        stringBuffer.append(priorityQueue.poll());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(GetSequeOddNum(n));
        }
    }
}
