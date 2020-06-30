import java.util.Arrays;

/**
 * Author: dts
 * DateTime: 2020/6/23 13:42
 * Description: TODO
 */
public class Gift {
    public static int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (gifts[i]==gifts[n/2]){
                temp++;
            }
        }
        if(temp>n/2){
            return gifts[n/2];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,5};
        System.out.println(getValue(arr, 5));
    }
}