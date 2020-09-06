import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int AA = 0;
        int aa = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch>='A'&&ch<='Z'){
                AA++;
            }else if(ch>='a'&&ch<='z'){
                aa++;
            }
        }
        int n = AA-aa;
        if(n<0){
            n=-n;
        }
        System.out.println(n / 2);

    }
}
