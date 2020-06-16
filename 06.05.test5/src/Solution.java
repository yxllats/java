import java.util.Stack;
/**
 * Author: dts
 * DateTime: 2020/6/5 10:04
 * Description: TODO
 */


public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack2.push(node);
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        return stack2.pop();
    }
}