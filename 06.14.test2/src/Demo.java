import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/14 22:33
 * Description: TODO
 */
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 0;
        int n = in.nextInt();
        if(n<3||n>20){
            return;
        }
        char ch = in.next().charAt(0);
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
        System.out.println();
        if(n%2==1){
            m = n/2+1;
        }else {
            m = n/2;
        }
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0||j==n-1){
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }
}
