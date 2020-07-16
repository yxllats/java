import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Stack<String> stack = new Stack<>();
            String s = in.nextLine();
            String[] strings = s.split(" ");
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
