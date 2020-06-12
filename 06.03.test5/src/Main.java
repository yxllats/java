import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/3 21:09
 * Description: TODO
 */
public class Main {
    public static int func(int n) {
        if(n%2!=0){
            return -1;
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if(6*i + 8*j ==n){
                    return i+j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(func(n));

    }
}
