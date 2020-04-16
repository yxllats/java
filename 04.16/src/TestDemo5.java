/**
 * Author: dts
 * DateTime: 2020/4/16 16:13
 * Description: 实现数组的toString
 */
public class TestDemo5 {
    public static String toString(int[] arr) {
        String str="[";
        for (int i = 0; i < arr.length-1; i++) {
            str += arr[i];
            str += ",";
        }
        str=str+arr[arr.length-1]+"]";
        return str;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,5,6};
        System.out.println(toString(array));
    }
}
