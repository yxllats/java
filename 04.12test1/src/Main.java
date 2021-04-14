import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,4,2,3,6,7,4,9};
        System.out.println(topK(arr, 1));
    }
    public static int topK(int[] array,int k){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        int size = list.size();
        int temp = 0;
        while (k>0&&size>0){
            k--;
            size--;
            temp++;
        }
        return list.get(temp-1).getValue();
    }
}
