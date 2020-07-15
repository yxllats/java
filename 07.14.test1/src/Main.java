import java.util.Arrays;

public class Main {
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] array = new int[n*n];
        int index = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <= i; j++) {
                array[index++] = arr[j][n - 1 + j - i];
            }
        }
        for (int i = 0; i < n; i++) {
            array[index++] = arr[i][i];
        }
        for (int i =  n -1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[n - i + j][j]+" ");
                array[index++] = arr[n-i+j][j];
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = num++;
            }
        }
        arrayPrint(arr,4);
    }
}
