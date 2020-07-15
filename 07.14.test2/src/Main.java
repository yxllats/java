import java.util.Scanner;

public class Main {
    public static void  detel(String s){
        String string ;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            string = s.substring(0,i)+s.substring(i+1);
            if(fun(string)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean fun(String s){
        int left = 0;
        int right = s.length()-1;
        boolean flag = true;
        while (left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            detel(s);
        }
    }
}
