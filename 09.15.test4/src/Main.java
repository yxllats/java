import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        Set<Character> set = new HashSet<>();
        if (string == null||string.length()==0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(set.add(ch)){
                stringBuffer.append(ch);
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
