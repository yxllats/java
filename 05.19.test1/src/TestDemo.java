/**
 * Author: dts
 * DateTime: 2020/5/19 20:30
 * Description: TODO
 */
public class TestDemo {
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i = 0;i<A.length;i++) {
            sum+=A[i];
        }
        if(sum%3!=0) {
            return false;
        }
        int left = 0;
        int right = A.length-1;
        int sum_left = 0;
        int sum_right = 0;
        while(left+1<right) {
            if(sum_left==sum/3&&sum_right==sum/3){
                return true;
            }
            if(sum_left!=sum/3){
                sum_left+=A[left];
                left++;
            }
            if(sum_right!=sum/3){
                sum_right+=A[right];
                right--;
            }
        }
        return false;
    }
    public static void exchange(int[] a,int[] b){
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new  int[]{3,3,6,5,-2,2,5,1,-9,4};
        boolean bl = canThreePartsEqualSum(arr);
        System.out.println(bl);
        int[] arrays1 = new int[]{3,6};
        int[] arrays2 = new int[]{2,4};
        exchange(arrays1,arrays2);
        for (int i:arrays1) {
            System.out.println(i);
        }
    }
}