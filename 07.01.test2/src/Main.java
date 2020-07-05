import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/1 20:04
 * Description: TODO
 */
public class Main {
    public static String fun(String s){
        if(s.length()<9){
            return "NG";
        }
        boolean[] booleans = new boolean[4];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                booleans[0] = true;
            }else if(s.charAt(i)<91&&s.charAt(i)>64){
                booleans[1] = true;
            }else if(s.charAt(i)<123&&s.charAt(i)>96){
                booleans[2] = true;
            }else {
                booleans[3] = true;
            }
        }
        int n = 0;
        for (int i = 0; i < 4; i++) {
            if(booleans[i]){
                n++;
            }
        }
        if(n<3){
            return "NG";
        }
        //if((booleans[1]||booleans[0])&&(booleans[2]||booleans[3]))

        for (int i = 0; i < s.length()-3; i++) {
            String string1 = s.substring(i,i+3);
            String string = s.substring(i+3);
            if(string.contains(string1)){
                //System.out.println((-2));
               // System.out.println(string);
                //System.out.println(string1);
                return "NG";
            }
        }
        return "OK";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.next();
            System.out.println(fun(string));
        }
    }
}
