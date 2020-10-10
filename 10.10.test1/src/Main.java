import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if(n==0||k==0){
            System.out.println(0);
        }else if(n==1||k==1){
            System.out.println(1);
        }else {
            System.out.println(numOf(n, k));
        }

    }
    public static int numOf (int n, int k ){
        int[] arr = new int[k];
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= n/2; i++) {
            arr[0] = i;
            getNum(n,i,arr,1,k,set);

        }
        return set.size();
    }
    public static void getNum(int n,int m,int[] arr,int index,int k,Set<String> set){
        if(m==n&&index<k){
            return;
        }
        if(k==index){
            if(m==n) {

                int[] array = Arrays.copyOf(arr,arr.length);
                Arrays.sort(array);
                set.add(Arrays.toString(array));
                // if(set.add(Arrays.toString(array))){
              //      System.out.println(Arrays.toString(array));
             //   }
            }
            return;
        }
        for (int i = 0; i <= n-m; i++) {
            arr[index] = i;
            getNum(n,m+i,arr,index+1,k,set);
        }

    }
}
