public class Solution {
    public static int sort (String inData) {
        // write code here
        String[] strings = inData.split(" ");
        int len = strings.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        int temp = 0;
        int index = 0;
        int ret = 0;

        boolean flag = true;
        for (int i = 0; i < len; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0 ; j < len - i; j++) {

                if(max<arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            if(index==len - i-1){
                continue;
            }
            temp = arr[len - i -1];
            arr[len - i - 1] = max;
            arr[index] = temp;
            ret++;

            flag = true;
            for (int k = 0; k < len -1; k++) {
                if(arr[k+1]<arr[k]) {
                    flag = false;
                }
            }
            if(flag==true){
                break;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(sort("19 5 9 255"));
    }
}
