import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/23 21:29
 * Description: TODO
 */
public class Main {
    public static int fun(int n){
        if(n<3){
            return 1;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(fun(n));
        }
    }
}
