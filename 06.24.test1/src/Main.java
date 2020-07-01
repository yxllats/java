import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/6/24 18:45
 * Description: TODO
 */
public class Main {
    static int add = 0;
    static int sub = 0;
    public static Boolean fun(String s1,String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        add = 0;
        sub = 0;
        int n = 0;

        for (char ch:s2.toCharArray()) {
            if(map2.containsKey(ch)) {
                map2.put(ch,map2.get(ch)+1);
            }else {
                map2.put(ch, 1);
            }
            set1.add(ch);
        }
        for (char ch:s1.toCharArray()) {
            if(map1.containsKey(ch)) {
                map1.put(ch,map1.get(ch)+1);
            }else {
                map1.put(ch, 1);
            }
        }

        Iterator<Character> it = set1.iterator();
        while (it.hasNext()){
            char ch = it.next();
            if(map1.containsKey(ch)){
                if(map1.get(ch)<map2.get(ch)){
                    n++;
                    sub += map2.get(ch) - map1.get(ch);
                }else {
                    add += map1.get(ch) - map2.get(ch);
                }
            }else {
                n++;
                sub += map2.get(ch);
            }
        }

        for (char ch:s1.toCharArray()) {
            if(set1.add(ch)){
                set2.add(ch);
            }
        }
        Iterator<Character> it1 = set2.iterator();
        while (it1.hasNext()) {
            char ch = it1.next();
            add+=map1.get(ch);
        }



        if(n>0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            if(fun(s1,s2)){
                System.out.print("Yes"+" "+add);
            }else {
                System.out.println("No"+" "+sub);
            }
        }
    }
}
