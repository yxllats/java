import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<String> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                stringBuffer.append(s.charAt(i));
            }else {
                stack.push(stringBuffer.toString());
                stringBuffer = new StringBuffer();
            }
        }
        stack.push(stringBuffer.toString());
        while (stack.size()>0){
            System.out.print(stack.pop()+" ");
        }
    }
}
