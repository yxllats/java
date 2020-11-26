import java.util.Map;
        import java.util.Scanner;
        import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();
        while (in.hasNext()){
            String s = in.nextLine();
            String[] strings = s.split(" ");
            int n1 = Integer.parseInt(strings[0]);
            int n2 = Integer.parseInt(strings[0]);
            if(map.containsKey(n1)){
                map.put(n1,map.get(n1)+1);
            }else {
                map.put(n1,1);
            }
            if(map.containsKey(n2)){
                map.put(n1,map.get(n2)+1);
            }else {
                map.put(n1,0);
            }
        }

    }
}
