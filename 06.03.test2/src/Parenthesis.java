import java.util.Stack;

/**
 * Author: dts
 * DateTime: 2020/6/3 14:16
 * Description: TODO
 */
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch =='('){
                stack.push(ch);
            }else if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }else if(stack.pop() != '('){
                    return false;
                }
            }else {
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String string = "(()())";
        System.out.println(chkParenthesis(string, 6));
    }
}
