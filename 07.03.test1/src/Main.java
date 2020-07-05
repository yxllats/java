import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/3 9:07
 * Description: TODO
 */
public class Main {
    public static double fun(int n ){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return (n-1)*(fun(n-1)+fun(n-2));
    }

    public static double f(int n){
        if(n==1){
            return 1;
        }
        return n*f(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            double sum = f(n);
            double s = fun(n);
            double res = s/sum*100;
            System.out.println(String.format("%.2f",res)+"%");
        }
    }
}
