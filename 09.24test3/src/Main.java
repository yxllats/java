import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            while (y>0){
                list.add(x);
                y--;
            }
        }
        int[] arrA = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrA[i] = list.get(i);
        }

        list.clear();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            while (y>0){
                list.add(x);
                y--;
            }
        }
        int[] arrB = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrB[i] = list.get(i);
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int k = 0;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = index; j < arrB.length; j++) {
                if(arrA[i]>arrB[j]){
                    k++;
                }else {
                    index = j;
                    break;
                }
            }
            sum+=k;
        }
        System.out.println(sum);
    }
}
