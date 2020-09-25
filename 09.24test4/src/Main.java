import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
            }
        }
    }
}
