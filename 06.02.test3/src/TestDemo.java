import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: dts
 * DateTime: 2020/6/2 15:58
 * Description: TODO
 */
public class TestDemo {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o2[0]+o2[1])-(o1[0]+o1[1]);
            }
        }) ;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                queue.add(new int[]{nums1[i],nums2[j]});
                if(--k==0){
                    break;
                }
            }
            if(k==0){
                break;
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        queue.add(22);
        queue.add(10);
        int[] arr = new int[5];
        queue.add(60);
        System.out.println(queue.poll());
    }
}
