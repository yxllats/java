/**
 * Author: dts
 * DateTime: 2020/6/22 14:19
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int tem = 1;
        for (int i = 0; i < 30; i++) {
            sum += tem;
            tem *= 2;
        }
        System.out.println(sum/100);

        System.out.println(100000*30);


    }
}
