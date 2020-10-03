import java.util.Arrays;

public class Main {
    public int getValue(int[] nums,int n){
        Arrays.sort(nums);
        int k = nums[n/2];
        int sum = n/2+1;
        for (int i = 0; i < n; i++) {
            if(nums[i] == k){
                sum--;
                if(sum==0){
                    return k;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
