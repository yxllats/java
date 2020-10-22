public class Solution {
    public static void main(String[] args) {

    }
    public int palindromeCount (String str) {
        // write code here
        int sum = 0;
        if(str==null||str.length()==0){
            return sum;
        }
        int len = str.length();
        sum+=len;
        for (int i = 0; i < len; i++) {
            char  ch = str.charAt(i);
            for (int j = i+1; j < len; j++) {
                if(str.charAt(j)==ch){
                    if(func(str.substring(i,j+1))){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
    public static boolean func(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
