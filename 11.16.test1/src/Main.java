import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (in.hasNext()){
            int n = in.nextInt();
            if(n!=-1) {
                list.add(n);
            }
        }
        int size = list.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }
        if(size==0){
            System.out.println(0);
        }else {
            int left = 0;
            int right = arr.length-1;
            while (left<right){
                int mid = (left+right)/2;
                if(arr[mid]>arr[left]){
                    left = mid;
                }else if(arr[mid]<arr[left]){
                    right = mid;
                }else {
                    left++;
                }
            }
            System.out.println(arr[right]);
        }
    }
}
