import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (num>0){
            num--;
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr1[i] = in.nextInt();
                map.put(arr1[i],i);
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = in.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int temp = 0;
            int index = m-1;
            int[] get = new int[n];

            for (int i = n-1; i >= 0 ; i--) {
                for (int j = index; j >=0 ; j--) {
                    if(arr1[i]>arr2[j]){
                        index = j;
                        break;
                    }else {
                        temp++;
                    }
                }
                get[map.get(arr1[i])] = temp;
            }
            for (int i = 0; i < n-1; i++) {
                System.out.print(get[i]+" ");
            }
            System.out.print(get[n-1]);

        }
    }
}
