import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/29 19:32
 * Description: TODO
 */
public class Main {
    public static int numSum(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static int squareSum(int n){
        int sum = 0;
        int num = (int)Math.pow(n,2);
        while (num>0){
            sum +=num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.print(numSum(n)+" ");
            System.out.println(squareSum(n));
        }
    }
}
