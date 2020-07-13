import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            if(s.contains(" ")) {
                String[] strings = s.split(" ");
                for (String str : strings)
                    System.out.print(Integer.parseInt(str.substring(2), 16)+" ");
            }else {
                System.out.println(Integer.parseInt(s.substring(2), 16));
            }
        }
    }
}
