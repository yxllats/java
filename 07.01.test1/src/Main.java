import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/7/1 19:37
 * Description: TODO
 */
public class Main {
    public static String fun(int n ){
        String string = "Yes!";
        if(n==0){
            return string;
        }
        int num = (int)Math.pow(n,2);
        while (n>0){
            int x = n%10;
            int y = num%10;
            if(x==y){
                n=n/10;
                num=num/10;
            }else {
                string = "No!";
                break;
            }
        }
        return string;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(fun(n));
        }
    }
}
