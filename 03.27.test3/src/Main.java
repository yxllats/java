import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String[] strings = s1.split(" ");
        int n = Integer.parseInt(strings[0]);
        int c1 = Integer.parseInt(strings[1]);
        int c2 = Integer.parseInt(strings[2]);
        int min = Math.min(c1,c2);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i)=='F'){
                count++;
                if(count==3){
                    sum++;
                    count=0;
                }
            }
        }
        System.out.println((sum * min));
    }

}
