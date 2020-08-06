import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        List<String> n = new ArrayList<String>();
        System.out.println(n instanceof ArrayList);
    }
}
