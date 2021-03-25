import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        String string2 = in.nextLine();
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        Set<Character> set = new HashSet<>();
        if(string1==null||string2==null){
            System.out.println(false);
            return;
        }
        if(string1.length()!=string2.length()||string1.length()<2){
            System.out.println(false);
            return;
        }
        if(string1.equals(string2)){
            for (int i = 0; i < string1.length(); i++) {
                if(set.contains(string1.charAt(i))){
                    System.out.println(true);
                    return;
                }
                set.add(string1.charAt(i));
            }
        }

        for (int i = 0; i < string1.length(); i++) {
            if(string1.charAt(i)!=string2.charAt(i)) {
                str1.append(string1.charAt(i));
                str2.append(string2.charAt(i));
            }
            if(str1.length()>2){
                System.out.println(false);
                return;
            }
            if(str1.length()==2&&str1.charAt(0)==str2.charAt(1)&&str1.charAt(1)==str2.charAt(0)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
