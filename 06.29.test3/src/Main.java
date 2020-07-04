import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/6/29 19:38
 * Description: TODO
 */
public class Main {
    static List<String> list = new ArrayList<>();
    static Map<String,Integer>  map = new HashMap<>();

    public static int add(String ch){
        if(list.contains(ch)){
            return 0;
        }
        list.add(ch);
        return 1;
    }
    public static void vote(String ch){
        if(list.contains(ch)){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
    }

    public static int get(String ch){
        if(map.containsKey(ch)){
            return map.get(ch);
        }
        return 0;
    }
    public static void clear(){
        list.clear();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                String ch = in.next();
                add(ch);
            }
            int x = in.nextInt();
            for (int i = 0; i < x ; i++) {
                String ch = in.next();
                vote(ch);
            }
            Iterator<String> it = list.iterator();
            int sum = 0;
            while (it.hasNext()){
                String ch = it.next();
                System.out.print(ch+" "+":"+" ");
                sum += get(ch);
                System.out.println(get(ch));

            }
            int y = x-sum;
            System.out.println("Invalid : "+y);
            clear();
        }
    }
}
