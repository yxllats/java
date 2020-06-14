import java.util.HashMap;
import java.util.Stack;

/**
 * Author: dts
 * DateTime: 2020/6/4 14:40
 * Description: TODO
 */
public class StockSpanner {
    Stack<Integer> stack ;
    HashMap<Integer,Integer> map ;
    public StockSpanner() {
        stack = new Stack<>();
        map = new HashMap<>();
    }

    public int next(int price) {
        int n = 1;
        while (!stack.isEmpty()&&stack.peek()<=price){
            n+=map.get(stack.pop());
        }
        stack.push(price);
        map.put(price,n);
        return n;
    }

    public static void main(String[] args) {
        StockSpanner st = new StockSpanner();
        System.out.println(st.next(100));
        System.out.println(st.next(80));
    }
}
