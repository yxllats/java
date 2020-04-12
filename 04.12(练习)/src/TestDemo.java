/**
 * Author: dts
 * DateTime: 2020/4/12 21:57
 * description:
 */
public class TestDemo {
    public static int sum(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum_num=sum(a,b);
        System.out.println(sum_num);
        int ret2=sum(80,21);
        System.out.println(ret2);
    }
}
