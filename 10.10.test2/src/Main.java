import java.util.Scanner;

public class Main {
    public static int sum = 0;
    public static void getSum(String[] strings,int n,char ch,char charA){
        for (int i = 0; i < n; i++) {
            if(strings[i].charAt(0)==ch){
                sum++;
                charA = ch;
                ch = strings[i].charAt(strings.length-1);
                if(ch == charA){
                    break;
                }
                //strings[i] = "null";
                getSum(strings,n,ch,charA);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.nextLine().charAt(0);
        String string = in.nextLine();
        int n = Integer.parseInt(string);
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = in.nextLine();
        }
        getSum(strings,n,ch,ch);
        System.out.println(sum);

    }

}
