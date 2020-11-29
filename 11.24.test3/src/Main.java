import java.util.Scanner;

public class Main {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String strA = in.nextLine();
            String srtB = in.nextLine();
            fun(srtB+strA);
            for (int i = 1; i < strA.length()+1; i++) {
                String string = strA.substring(0,i)+srtB+strA.substring(i);
                fun(string);
            }
            System.out.println(sum);
        }
    }
    public static void fun(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return;
            }
            left++;
            right--;
        }
        sum++;
    }
}
