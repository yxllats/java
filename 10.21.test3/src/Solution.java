import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

    }
    public String removeDuplicatedChars (String str) {
        // write code here
        Set<Character> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(set.add(str.charAt(i))){
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
