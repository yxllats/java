public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int[] arr = new int[index];
        int get2 = 0;
        int get3 = 0;
        int get5 = 0;
        arr[0] = 1;
        for(int i=1;i<index;i++){
            int n = Math.min(arr[get2]*2,Math.min(arr[get3]*3,arr[get5]*5));
            arr[i] = n;
            if(2*arr[get2]==n){
                get2++;
            }
            if(3*arr[get3]==n){
                get3++;
            }
            if(5*arr[get5]==n){
                get5++;
            }
        }
        return arr[index-1];
    }
}