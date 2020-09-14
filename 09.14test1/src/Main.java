import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int longestValidParenthe(String s) {
        Stack<Character> stack = new Stack<>();
        int temp = 0;
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
                list.add(i);
                if(sum<temp){
                    sum = temp;
                }
                temp = 0;
            }else {
                if(stack.size()>0) {
                    stack.pop();
                    list.remove(list.size() - 1);
                    temp++;
                }
            }
        }
        if(stack.size()==0){
            sum+=temp;
        }
        return sum;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = longestValidParenthe(_s);
        System.out.println(String.valueOf(res));

    }
}
