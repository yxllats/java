import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < string.length() - 3; i++) {
                char ch = string.charAt(i);
                if(ch>='0'&&ch<='9'){
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(ch);
                    for (int j = i + 1; j<string.length(); j++) {
                        char ch1 = string.charAt(j);
                        if(ch1>='0'&&ch1<='9'){
                            stringBuffer.append(ch1);
                        }else {
                            i = j;
                            break;
                        }
                    }
                    if(stringBuffer.length()==4) {
                        int n = Integer.valueOf(stringBuffer.toString());
                        list.add(n);
                    }
                }
            }
            if(list.size()==0){
                System.out.println("");
            }
            StringBuffer StringBuffer = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                int n = list.get(i);
                if(n<4000&&n>=1000) {
                    StringBuffer.append(n);
                }
                StringBuffer.append(" ");
            }
            System.out.println(StringBuffer.toString().substring(0, StringBuffer.length() - 1));
        }
    }
}
