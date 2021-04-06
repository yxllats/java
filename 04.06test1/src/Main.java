import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(minWindow("aaabcdf", "aafd"));
    }
    public static String minWindow (String a, String b) {
        // write code here
        if(b==null||b.length()==0){
            return a;
        }
        if(a.length()<b.length()){
            return "";
        }
        HashMap<Character,Integer> mapA = new HashMap<>();
        HashMap<Character,Integer> mapB = new HashMap<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(mapA.containsKey(ch)){
                mapA.put(ch,mapA.get(ch)+1);
            }else {
                mapA.put(ch,1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if(mapB.containsKey(ch)){
                mapB.put(ch,mapB.get(ch)+1);
            }else {
                mapB.put(ch,1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(!mapA.containsKey(b.charAt(i))){
                return "";
            }
            if(mapA.get(b.charAt(i))<mapB.get(b.charAt(i))){
                return "";
            }
        }
        for (int i = 0; i < a.length(); i++) {
            mapA.put(a.charAt(i),mapA.get(a.charAt(i))-1);
            if(mapA.get(a.charAt(i))<mapB.get(a.charAt(i))){
                left = i;
                break;
            }
        }
        for (int i = a.length()-1; i >= 0; i--) {

            mapA.put(a.charAt(i),mapA.get(a.charAt(i))-1);
            if(mapA.get(a.charAt(i))<mapB.get(a.charAt(i))){
                right= i;
                break;
            }
        }
        return a.substring(left,right+1);
    }
}
