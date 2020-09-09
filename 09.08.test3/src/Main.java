import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {

            for (int j = 0; j < strings[i].toCharArray().length; j++) {
                StringBuffer buffer = new StringBuffer();
                if(stack.size()==0) {
                    buffer.append(strings[i].charAt(j));
                    stack.push(buffer.toString());
                }else {
                    buffer.append(stack.pop());
                    buffer.append(strings[i].charAt(j));
                    stack.push(buffer.toString());
                }
            }
        }
        char ch = strings[0].charAt(0);
        while (stack.size()>0){
            String str = stack.pop();
            if(str.lastIndexOf(ch)>0){
                System.out.println(str+"--circular dependency");
            }
            System.out.println(str);
        }
    }
}
