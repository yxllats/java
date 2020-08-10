public class Main {
    public static boolean isPal(String s,int left ,int right){
        while (left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int minCut (String s) {
        // write code here
        int len = s.length();
        int[] minCut = new int[len+1];
        for (int i = 0; i <= len; i++) {
            minCut[i] = i-1;
        }
        for (int i = 1; i <=len ; i++) {
            for (int j =0; j < i; j++) {
                if(isPal(s,j,i-1)){
                    minCut[i] = Math.min(minCut[i],minCut[j]+1);
                }
            }
        }
        return minCut[len];
    }
}
