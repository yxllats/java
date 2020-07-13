import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Map<Character,Integer> map = new TreeMap<>();
            for (int i = 0; i < 26; i++) {
                map.put((char)(i+65),0);
            }
            String s = in.next();
            for(char ch:s.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
            }
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
