/**
 * Author: dts
 * DateTime: 2020/6/16 23:08
 * Description: TODO
 */
public class Main {
    static int n = 0;
    public static void func(long x){
        long x1 = 4*x+3;
        long x2 = 8*x+7;
        n++;
        if(x1%1000000007==0||x2%1000000007==0){
            System.out.println(n);
        }
        if(n>=99999){
            System.out.println(-1);
        }
        func(x1);
        func(x2);
    }
    public static void main(String[] args) {
        func(125000000);
    }
}
