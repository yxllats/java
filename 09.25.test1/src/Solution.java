public class Solution {
    public static String rotatePassword (String[] s1, String[] s2) {
        // write code here
        int len = s1.length;
        char[][] chars = new char[len][len];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                char ch = s1[i].charAt(j);
                chars[i][j] = ch;
                if(ch=='0'){
                    stringBuffer.append(s2[i].charAt(j));
                }
            }
        }
        char[][][] swing = new char[4][len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                swing[0][i][j] = chars[i][j];
            }
        }
        for (int k = 1; k < 4; k++) {

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    swing[k][i][j] = swing[k-1][len - j - 1][i];
                    if (swing[k][i][j] == '0') {
                        stringBuffer.append(s2[i].charAt(j));
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String[] strings1 = {"1101","1010","1111","1110"};
        String[] strings2 = {"ABCD","EFGH","IJKL","MNPQ"};
        System.out.println(rotatePassword(strings1, strings2));
        // CFHQGLMP GLMPGLMP
       // "CFHQGLMP AIKNBDEJ"
    }
}
