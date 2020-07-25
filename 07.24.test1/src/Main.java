public class Main {
    public static int findMaxGap(int[] A, int n) {
        // write code here
        int[] max = new int[2];
        int get = 0;
        int num = 0;
        for (int k = 0; k < n-1; k++) {
            if (A[k] > max[0]) {
                max[0] = A[k];
            }
            max[1] = 0;
            for (int i = k+1; i < A.length; i++) {
                if(A[i]>max[1]){
                    max[1] = A[i];
                }
            }
            num = max[0] - max[1]>= 0? max[0] - max[1]:-1*(max[0] - max[1]);
            if(num>get){
                get = num;
            }
        }
        return get;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,3,1,1};
        System.out.println(findMaxGap(arr, 5));
    }
}
