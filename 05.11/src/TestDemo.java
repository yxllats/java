/**
 * Author: dts
 * DateTime: 2020/5/11 15:23
 * Description: TODO
 */
public class TestDemo {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((TestDemo)null).testMethod();
    }
}