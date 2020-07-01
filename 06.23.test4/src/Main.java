import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/23 21:34
 * Description: TODO
 */
public class Main {
    public static String change(String string){
        StringBuffer stringBuffer = new StringBuffer();
        for (char ch:string.toCharArray()) {
            if(ch-5>=65){
                ch-=5;
                stringBuffer.append(ch);
            }else if(ch==' '){
                stringBuffer.append(ch);
            } else {
                ch +=21;
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            System.out.println(change(string));
        }
    }
}
