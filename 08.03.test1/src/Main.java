import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();

            int len = 0;
            String str = null;

            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);

                if(ch<='9'&&ch>='0'){
                    len++;
                }else{
                    if(str==null||len>str.length()){
                        str = string.substring(i-len,i);
                    }
                    len = 0;
                }
                if(i==string.length()-1&&(str==null||len>str.length())){
                    str = string.substring(i-len+1);
                }
            }
            System.out.println(str);
        }
    }
}
