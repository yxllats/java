import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        if(str.length()==0||str==null){
            return;
        }
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuffer stringBuffer = new StringBuffer();
        boolean[] booleans = new boolean[str.length()];
    }
    public static ArrayList<String> fun(char[] chars,StringBuffer stringBuffer,ArrayList<String> list,boolean[] booleans){
        if(stringBuffer.length() == chars.length){
            list.add(stringBuffer.toString());
            return list;
        }
        for (int i = 0; i < chars.length; i++) {
            if(booleans[i]||(i>0&&chars[i]==chars[i-1]&&booleans[i-1])){
                continue;
            }
            stringBuffer.append(chars.length);
        }
    }
}
