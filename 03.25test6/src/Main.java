public class Main {
    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{5,4,3,2,1}));
    }
    public static int maxChunksToSorted (int[] arr) {
        // write code here
        if(arr.length==0||arr==null){
            return 0;
        }
        int count = 1;
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(num <= arr[i]){
                num = arr[i];
                count++;
            }
        }
        return count;
    }
}
