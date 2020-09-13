import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int index = 0;
        for (int i = 1; i < n/2; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>-1){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                    j--;
                }else{
                    arr[j+1] = temp;
                    break;
                }
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
