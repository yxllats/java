import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/5/30 22:28
 * Description: TODO
 */
public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        LinkedList<String>  res = new LinkedList<>();
        //单词和次数对应
        Map<String,Integer> map = new HashMap<>();
        //先将数组当中的每个单词存放至map当中
        for(String s : words) {
            if(map.get(s) == null){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }

        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k,new Comparator<Map.Entry<String, Integer>>(){
            //这个方法的作用是：放入元素之后，进行调整的。
            public int compare(Map.Entry<String, Integer> x, Map.Entry<String, Integer> y) {
                //频率相同：如果是小堆的形式是：i  love   出的时间就是love i 了
                if(x.getValue()==y.getValue()){

                    return y.getKey().compareTo(x.getKey());
                    //return x.getKey().compareTo(y.getKey());
                }
                return x.getValue()-y.getValue();
            }
        });


        //每次添加的时候  触发上面的排序
        for(Map.Entry<String,Integer> i : map.entrySet()){
            if (minHeap.size() < k) { // 未达到最大容量，直接添加
                minHeap.add(i);
            } else { // 队列已满
                Map.Entry<String,Integer> top = minHeap.peek();
                if(top.getValue() == i.getValue()) {
                    //相等之后，字母顺序小的入队
                    if( top.getKey().compareTo(i.getKey()) > 0 ){
                        minHeap.poll();
                        minHeap.add(i);
                    }
                }else{
                    if(top.getValue() < i.getValue()) {
                        minHeap.poll();
                        minHeap.add(i);
                    }
                }
            }
        }
        System.out.println(minHeap);//可以看到结果和我们想要的是反着的。

        for(int i = 0; i< k; ++i){
            String temp = minHeap.peek().getKey();
            res.add(0,temp);
            minHeap.poll();
        }
        return res;
    }
}