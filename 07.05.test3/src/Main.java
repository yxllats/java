import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Author: dts
 * DateTime: 2020/7/5 19:17
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] strings = in.nextLine().split(" ");
            Stack<String> stack = new Stack<>();
            for (String s:strings) {
                stack.push(s);
            }
            while (stack.size()>1){
                System.out.print(stack.pop()+" ");
            }
            System.out.println(stack.pop());
        }
    }
}
