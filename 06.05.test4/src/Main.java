import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/6/5 20:14
 * Description: TODO
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }

        int A = (arr[0]+arr[2])/2;
        int B = (arr[1]+arr[3])/2;
        int C = B-arr[1];
        if((arr[0]+arr[2])%2==0&&(arr[1]+arr[3])%2==0&&(A+B==arr[2])){
            System.out.println(A+" "+B+" "+C);
        }else{
            System.out.println("No");
        }
    }
}
