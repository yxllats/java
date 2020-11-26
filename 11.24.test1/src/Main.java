import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if(n==0){
                break;
            }
            System.out.println(get(n));
        }
    }
    public static int get(int n){
        if(n==2){
            return 1;
        }
        if(n<2){
            return 0;
        }
        return n/3 + get(n/3+n%3);
    }
}
