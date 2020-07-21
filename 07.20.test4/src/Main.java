import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i)!='_'){
                    stringBuffer.append(string.charAt(i));
                }else {
                    stringBuffer.append((char)(string.charAt(++i)-32));
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
