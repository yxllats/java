import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            for (char ch:s.toCharArray()){
                if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                    stringBuffer.append(ch);
                }else {
                    stringBuffer.append(" ");
                }
            }
            s = stringBuffer.toString();
            String[] strings = s.split(" ");
            Stack<String> stack = new Stack<>();
            for (String string:strings){
                stack.push(string);
            }
            while (stack.size()>1){
                System.out.print(stack.pop()+" ");
            }
            System.out.print(stack.pop());
        }
    }
}
