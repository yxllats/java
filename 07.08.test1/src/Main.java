import java.util.*;

public class Main {
    public static void fun(char[] ch1,char[] ch2) {
        int[] array = new int[3];
        Map<Character, Integer> map_A = new TreeMap<>();
        Map<Character, Integer> map_B = new TreeMap<>();
        for (int i = 0; i < ch1.length; i++) {
            if (code(ch1[i], ch2[i]) == 0) {
                array[1] += 1;
            } else if (code(ch1[i], ch2[i]) == 1) {
                array[0] += 1;
                if (map_A.containsKey(ch1[i])) {
                    map_A.put(ch1[i], map_A.get(ch1[i]) + 1);
                } else {
                    map_A.put(ch1[i], 1);
                }
            } else {
                array[2] += 1;
                if (map_B.containsKey(ch1[i])) {
                    map_B.put(ch2[i], map_B.get(ch2[i]) + 1);
                } else {
                    map_B.put(ch2[i], 1);
                }
            }
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
        System.out.println(array[2] + " " + array[1] + " " + array[0]);
        char getA_char = ' ' ;
        char getB_char = ' ';
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map_A.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<Character, Integer> e : list) {
            getA_char = e.getKey();
            break;
        }
        list.clear();
        list = new ArrayList<Map.Entry<Character, Integer>>(map_B.entrySet());
        for (Map.Entry<Character, Integer> e : list) {
            getB_char = e.getKey();
            break;
        }
        if(map_A.size()>0&&map_B.size()>0) {
            System.out.println(getA_char+" "+getB_char);
        }
        else if(map_A.size()>0){
            getB_char = get_Char(getA_char);
            System.out.println(getA_char+" "+getB_char);
        }else {
            getA_char = get_Char(getB_char);
            System.out.println(getA_char+" "+getB_char);
        }
    }
    public static char get_Char(char ch){
        if(ch=='C'){
            return 'B';
        }else if(ch=='J'){
            return 'C';
        }
        return 'J';
    }
    private static int code(char ch1,char ch2){
        if(ch1==ch2){
            return 0;
        }
        if(ch1=='C'){
            if(ch2=='J'){
                return 1;
            }
        }else if(ch1=='J'){
            if(ch2=='B'){
                return 1;
            }
        }else if(ch1=='B'){
            if(ch2=='C'){
                return 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            char[] AA = new char[n];
            char[] BB = new char[n];
            for (int i = 0; i < n; i++) {
                AA[i] = in.next().charAt(0);
                BB[i] = in.next().charAt(0);
            }
            fun(AA,BB);
        }
    }
}
