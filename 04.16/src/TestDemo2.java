/**
 * Author: dts
 * DateTime: 2020/4/16 15:06
 * Description: 判断数组是否有序
 */
public class TestDemo2 {
    public static boolean isUp(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(isUp(array));
    }
}
