import java.util.*;

public class Main {
    static Map<Integer,String> map ;
    static Set<Integer> set;
    static Queue<Integer> queue ;
    static int N ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
       // List<String> list = new LinkedList<>();
        while (n>0){
            map = new HashMap<>();
            set = new HashSet<>();
            queue = new LinkedList<>();
            N = 0;

            int sum = Integer.valueOf(in.nextLine());
            for (int i = 0; i < sum; i++) {
                String string = in.nextLine();
                String[] strings = string.split(" ");
                if(strings[0].equals("open")){
                 //   list.add(open(strings[1]));
                    System.out.println(open(strings[1]));
                }else if(strings[0].equals("dup")){
                //   list.add(dup(Integer.valueOf(strings[1])));
                    System.out.println(dup(Integer.valueOf(strings[1])));
                }else if(strings[0].equals("dup2")){
                    dup2(Integer.valueOf(strings[1]),Integer.valueOf(strings[2]));
                }else if(strings[0].equals("query")){
                   // list.add(query(Integer.valueOf(strings[1])));
                    System.out.println(query(Integer.valueOf(strings[1])));
                }else if(strings[0].equals("close")){
                    close(Integer.valueOf(strings[1]));
                }
            }

            n--;
        }
       // for (int i = 0; i < list.size(); i++) {
      //      System.out.println(list.get(i));
     //   }
    }
    public static String open(String string){
        int i = 0;
        if(queue.size()>0){
            i = queue.poll();
        }else {
            while (set.contains(N)){
                N++;
            }
            i = N;
            N++;
        }
        set.add(i);
        map.put(i,string);
        return String.valueOf(i);
    }
    public static String dup(int n){
        int i = 0;
        if(queue.size()>0){
            i  = queue.poll();
        }else {
            while (set.contains(N)){
                N++;
            }
            i = N;
            N++;
        }
        map.put(i, map.get(n));
        map.remove(n);
        set.remove(n);
        queue.offer(n);
        return String.valueOf(i);
    }
    public static void dup2(int n,int m){
        if(set.contains(m)){
            map.remove(m);
            map.put(m,map.get(n));
        }else {
            queue.remove(m);
            map.put(m,map.get(n));
            set.add(m);
        }
    }
    public static String query(int n){
        return map.get(n);
    }
    public static void close(int n){
        set.remove(n);
        queue.offer(n);
        map.remove(n);
    }
}