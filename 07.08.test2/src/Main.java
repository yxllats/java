public class Main {
    public static int fun(int n){
        int[] arr =  new int[100000];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for (int i = 3; i < n ; i++) {
            arr[i] = ((arr[i-1]+ arr[i-2])%1000000007+arr[i-3])%1000000007;
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        System.out.println(fun(3));
    }
}
