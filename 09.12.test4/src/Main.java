import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int n = in.nextInt();
        int m = string.length();
        if(n>m){
            n = n%m;
        }
        String string1 = string.substring(n);
        String string2 = string.substring(0,n);
        System.out.println(string1+string2);
    }
}
