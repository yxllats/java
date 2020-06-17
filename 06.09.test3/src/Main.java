import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/9 19:13
 * Description: TODO
 */
public class Main {

    public static void get_Num(int n){
        if(n>=0&&n<10) {
            System.out.print(n);
            return;
        }else {
            System.out.print(n % 10);
        }
        get_Num(n/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        get_Num(in.nextInt());
    }
}
