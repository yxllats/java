import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/3 19:01
 * Description: TODO
 */
public class Main {
    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        while(c<n){
            c = a+b;
            a = b;
            b = c;
        }
        if(c==n){
            return 0;
        }
        return fun(a,c,n);
    }

    public static int fun(int num1, int num2,int n){
        return Math.min((n - num1),(num2 -n));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fibonacci(n));
    }
}