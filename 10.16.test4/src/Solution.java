public class Solution {
    public static void main(String[] args) {

        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(func1(arr));
    }
    public static int func1 (int[] list) {
        // write code here
        int height = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]>height){
                height = list[i];
            }
        }
        int sum = 0;
        int left = 0;
        int right = 0;
        int[] arr = new int[list.length];
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < list.length; i++) {
                if(list[i]>j){
                    arr[i] = 1;
                }else {
                    arr[i] = 0;
                }
            }
            for (int i = 0; i < list.length; i++) {
                if(arr[i]==1){
                    left = i;
                    for (int k = i+1; k < list.length; k++) {
                        if(arr[k]==1){
                            right = k;
                            break;
                        }
                    }
                    if(right!=0) {
                        sum += (right - left-1);
                        i = right-1;
                        left = 0;
                        right = 0;
                    }

                }
            }
        }
        return sum;
    }
}
