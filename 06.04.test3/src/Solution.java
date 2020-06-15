import java.util.Stack;

/**
 * Author: dts
 * DateTime: 2020/6/4 18:13
 * Description: TODO
 */
public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0){
            return  false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            if(stack.peek()==popA[j]){
                if(j++ ==popA.length-1){
                    return true;
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            if(stack.pop()!=popA[j++]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s;
        System.out.println("s="+s);
    }
}
