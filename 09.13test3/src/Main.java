import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(" ");
        int len = strings.length;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }
        if(len<3){
            return;
        }
        Set<String> set = new HashSet<>();


        PriorityQueue<String> queue = new PriorityQueue<>();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i+1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if(array[i]+array[j]+array[k]==0){
                        StringBuffer stringBuffer = new StringBuffer();
                        int[] arr = new int[3];
                        arr[0] = array[i];
                        arr[1] = array[j];
                        arr[2] = array[k];
                        Arrays.sort(arr);
                        stringBuffer.append(arr[0]);
                        stringBuffer.append(" ");
                        stringBuffer.append(arr[1]);
                        stringBuffer.append(" ");
                        stringBuffer.append(arr[2]);
                        stringBuffer.append(" ");
                        set.add(stringBuffer.toString());
                    }
                }
            }
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            queue.offer(it.next());
        }
        while (queue.size()>0){
            System.out.println(queue.poll());
        }
    }
}
