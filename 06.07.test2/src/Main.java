import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/7 20:38
 * Description: TODO
 */
public class Main {
    public static int func(int x,int y){
        int sum = x+y;
        int num = x*y;
        x = Math.max(x,y);
        y = sum - x;
        int c = x%y;
        while (c!=0){

            x = y;
            y = c;
            c = x%y;
        }
        return num/y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(func(m, n));

    }
}
