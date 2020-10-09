import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!set1.add(ch)){
                set2.add(ch);
            }
        }
        int index = -1;
        for(int i=0;i<str.length();i++){
            if(set2.add(str.charAt(i))){
                index = i;
                break;
            }
        }
        return index;
    }
}