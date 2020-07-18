import java.util.Scanner;

public class Main {
    public static int get_Sum(int[] array){
        int sum = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp+=array[i];
            if(temp>sum){
                sum = temp;
            }
            if(temp<0) {
                temp = 0;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(get_Sum(arr));
        }
    }
}
