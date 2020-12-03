import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }else {
                if(stack.size()==0){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        if(stack.size()>0){
            return false;
        }
        return true;
    }
}