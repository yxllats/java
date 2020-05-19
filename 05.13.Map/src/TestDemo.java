import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author: dts
 * DateTime: 2020/5/13 16:22
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        System.out.println(map.get("1"));
        System.out.println(map.getOrDefault("3", "default"));
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry:set) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
            
        }
    }
}
