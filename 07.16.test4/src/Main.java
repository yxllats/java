import java.util.Scanner;

public class Main {
    static int x = 0;
    static int y = 0;
    public static boolean judge_Str(String s){
        if(s==null||s.length()<2){
            return false;
        }
        s = s.substring(1);
        for (char ch:s.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
    public static void go(String s){
        char ch = s.charAt(0);
        switch (ch){
            case 'A':
                x-= Integer.parseInt(s.substring(1));
                break;
            case 'S':
                y -= Integer.parseInt(s.substring(1));
                break;
            case 'D':
                x += Integer.parseInt(s.substring(1));
                break;
            case 'W':
                y += Integer.parseInt(s.substring(1));
                break;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] strings = s.split(";");
            for (String str:strings){
                if(judge_Str(str)){
                    go(str);
                }
            }
            System.out.println(x+","+y);
            x = 0;
            y = 0;
        }
    }
}
