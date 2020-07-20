import java.util.*;

public class Main {
    static Map<Character,Integer> map = new HashMap<>();
    static TreeSet<String> set = new TreeSet<>();


    public static void set_Phone(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for (char ch:s.toCharArray()){
            if(ch!='-'){
                if(ch>='0'&&ch<='9') {
                    stringBuffer.append(ch);
                }else {
                    stringBuffer.append(map.get(ch));
                }
            }
        }
        stringBuffer.insert(3,'-');
        set.add(stringBuffer.toString());
    }


    public static void main(String[] args) {
        int i = 2;
        int tem = 0;
        for (char ch = 'A'; ch<='Z'; ch++) {
            if(ch=='S'||ch=='Z'){
                tem--;
            }
            if(tem++==3){
                i++;
                tem = 1;
            }
            map.put(ch,i);
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            String s = in.nextLine();
            for (int j = 0; j < n; j++) {
                s = in.nextLine();
                set_Phone(s);
            }
            while (set.size()>0){
                System.out.println(set.pollFirst());
            }
            System.out.println();
        }
    }
}