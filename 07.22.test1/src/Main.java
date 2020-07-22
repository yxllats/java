import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            boolean flag = true;
            String string_A = in.next();
            String string_B = in.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for (char ch:string_B.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else {
                    map.put(ch,1);
                }
            }
            for (char ch:string_A.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)-1);
                }
            }
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue()>0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
