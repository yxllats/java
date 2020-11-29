public class AntiOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println(count(arr, 8));
    }
    private static int sum = 0;
    public static int count(int[] A, int n) {
        // write code here
        if(A==null||A.length==0){
            return sum;
        }
        fun(A,0,A.length-1);
        return sum;
    }
    public static void fun(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        fun(arr,left,mid);
        fun(arr, mid+1, right);
        sort(arr,left,mid,right);
    }
    public static void sort(int[] arr,int left,int mid,int right){
        int size = right - left + 1;
        int[] array = new int[size];
        int k = 0;
        int s1 = left;
        int s2 = mid+1;
        while (s1<=mid&&s2<=right){
            if(arr[s1]>arr[s2]){
                sum += mid - s1 + 1;
                sum=sum%1000000007;
                array[k++] = arr[s2++];
            }else {
                array[k++] = arr[s1++];
            }
        }
        while (s1<=mid){
            array[k++] = arr[s1++];
        }
        while (s2<=right){
            array[k++] = arr[s2++];
        }
        for (int i = 0; i < size; i++) {
            arr[i+left] = array[i];
        }
    }
}