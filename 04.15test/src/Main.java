import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(",");
        System.out.println(Arrays.toString(strings));
        Set<String> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < strings.length; i++) {
            if(set.add(strings[i])){
                stringBuffer.append(strings[i]);
                stringBuffer.append(",");
            }
        }
        stringBuffer.delete(stringBuffer.length()-1,stringBuffer.length());
        stringBuffer.append("]");
        System.out.println(stringBuffer.toString());
    }
}
