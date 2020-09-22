import java.util.Stack;

public class Solution {
    public static int calculate (String input) {
        // write code here
        if(input==null||input.length()==0){
            return 0;
        }
        Stack<Integer> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String[] strings = input.split(" ");
        if(!input.contains("+")&&!input.contains("-")&&!input.contains("*")&&!input.contains("/")){
            return Integer.parseInt(input.replace(" ", ""));
        }
        for (int i = 0; i < strings.length; i++) {
            if(i%2==0){
                stack1.push(Integer.parseInt(strings[i]));
            }else {
                char ch = strings[i].charAt(0);
                if(ch=='*'){
                    stack1.push(stack1.pop()*Integer.parseInt(strings[++i]));
                }else if(ch=='/'){
                    stack1.push(stack1.pop()/Integer.parseInt(strings[++i]));
                } else {
                    stack2.push(ch);
                }
            }
        }
        while (stack2.size()>0){
            char ch = stack2.pop();
            if(ch =='+') {
                stack1.push(stack1.pop() + stack1.pop());
            }else if(ch =='-'){
                stack1.push((-1) * stack1.pop() + stack1.pop());
            }else if(ch==' '){
                stack1.push(Integer.parseInt(Integer.toString(stack1.pop())+Integer.toString(stack1.pop())));
            }
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
        //System.out.println(calculate("-2 / 3 - 1"));
        //System.out.println(-2 / 3);
       // String s = "122";
       //String string = Integer.toString(12);
    }
}
