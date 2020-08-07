public class Main {
    public static boolean[][] getMat(String s){
        int len = s.length();
        boolean[][] mat = new boolean[len][len];
        for (int i = len-1; i >=0; i--) {
            for (int j = i; j < len; j++) {
                if(j==i){
                    mat[i][j]=true;
                }else if(j==i+1){
                    if(s.charAt(j)==s.charAt(i)){
                        mat[i][j]=true;
                    }else {
                        mat[i][j]=false;
                    }
                }else {
                    mat[i][j] = (s.charAt(i) == s.charAt(j)) && mat[i + 1][j - 1];
                }
            }
        }
        return mat;
    }
    public static int minCut (String s) {
        // write code here
        int len = s.length();
        boolean[][] Mat = getMat(s);
        int[] minCut = new int[len+1];
        for (int i = 0; i <= len; i++) {
            minCut[i] = i-1;
        }
        for (int i = 1; i <=len ; i++) {
            for (int j =0; j < i; j++) {
                if(Mat[j][i-1]){
                    minCut[i] = Math.min(minCut[i],minCut[j]+1);
                }
            }
        }
        return minCut[len];
    }
}
