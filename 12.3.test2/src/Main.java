import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        int ret = 0;
        while (n>0){
            sum = sum*n;
            n--;
        }
        String string = Integer.toString(sum);
        char[] chars = string.toCharArray();
        for (int i = chars.length-1; i >= 0 ; i--) {
            if(chars[i]=='0'){
                ret++;
            }else {
                break;
            }
        }
        System.out.println(ret);
    }
}