import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(" ");
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < Integer.parseInt(strings[0]); i++) {
            String s = in.nextLine();
            String[] ss = s.split(" ");
            for (int j = 0; j < ss.length; j++) {
                if(ss[j].contains(":")) {
                    String[] get = ss[j].split(":");
                    int k = Integer.parseInt(get[0]);
                    int v = Integer.parseInt(get[1]);
                    if (map.containsKey(k)) {
                        map.put(k, map.get(k) + v);
                    } else {
                        map.put(k, v);
                    }
                }
            }
        }
        Set set = map.keySet();
        if(set.size()==0){
            System.out.println("");
            return;
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }
    }
}
