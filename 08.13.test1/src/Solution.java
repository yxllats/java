public class Solution {
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        int sum = 1;
        while (target>1){
            sum*=2;
            target--;
        }
        return sum;
    }
}