import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            Set<Character> set = new HashSet<>();
            StringBuffer stringBuffer = new StringBuffer();
            for(char ch:s2.toCharArray()){
                set.add(ch);
            }
            for (char ch:s1.toCharArray()){
                if(set.add(ch)){
                    stringBuffer.append(ch);
                    set.remove(ch);
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
