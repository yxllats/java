import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){

            String string = in.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            if(string.equals("")){
                System.out.println(true);
            }else {
                for (int i = 0; i < string.length(); i++) {
                    char ch = string.charAt(i);
                    if(ch=='{'||ch=='('||ch=='['){
                        stack.push(ch);
                    }else if(ch=='}'||ch==')'||ch==']'){
                        if(stack.size()>0) {
                            if (ch == ')') {
                                if (stack.pop() != '(') {
                                    flag = false;
                                    break;
                                }
                            } else if (ch == '}') {
                                if (stack.pop() != '{') {
                                    flag = false;
                                    break;
                                }
                            } else {
                                if (stack.pop() != '[') {
                                    flag = false;
                                    break;
                                }
                            }
                        }else {
                            flag = false;
                            break;
                        }
                    }else {
                        flag = false;
                        break;
                    }
                }
                if(stack.size()>0){
                    flag = false;
                }
                System.out.println(flag);
            }

        }
    }
}
