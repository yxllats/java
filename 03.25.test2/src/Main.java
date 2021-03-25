import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s.length()>=100||s.length()==0||s==null){
            return;
        }
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            count++;
            if(len-1==i||s.charAt(i+1)!=s.charAt(i)){
                System.out.print(s.charAt(i)+""+count);
                count=0;
            }
        }
    }
}
