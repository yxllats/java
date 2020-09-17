import java.util.*;


public class Solution {
    /**
     *
     * @param str string字符串 
     * @return int整型
     */
    public static int lengthOfLongestSubstring (String str) {
        // write code here
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(set.add(ch)){
                stringBuffer.append(ch);
            }else {
                queue.offer(stringBuffer.toString());
                stringBuffer = new StringBuffer();
            }
        }
        if(stringBuffer.length()>0){
            queue.offer(stringBuffer.toString());
        }
        String  string = queue.poll();
        return string.length();
        //System.out.println(string);
        //.out.println(string.length());
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("welcome To Streamax");
    }
}