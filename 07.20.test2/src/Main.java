import java.util.Scanner;

public class Main {
    public static void fun(int[] arr){
        int left = -1;
        int right = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i] ) {
                    left = j;
                    break;
                }
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    right = j;
                    break;
                }
            }
            System.out.println(left+" "+right);
            left = right = -1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            fun(arr);
        }
    }
}
