import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/28 21:49
 * Description: TODO
 */
public class Main {
    public static double getGrade(int x,int y){
        if(y>89){
            return x * 4.0;
        }else if(y>84){
            return x * 3.7;
        }else if(y>81){
            return x * 3.3;
        }else if(y>77){
            return x * 3.0;
        }else if(y>74){
            return x * 2.7;
        }else if(y>71){
            return x * 2.3;
        }else if(y>67){
            return x * 2.0;
        }else if(y>63){
            return x * 1.5;
        }else if(y>59){
            return x * 1.0;
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = in.nextInt();
            }
            double x = 0;
            int num = 0;
            for (int i = 0; i < n; i++) {
                x+=getGrade(arr1[i],arr2[i]);
                num+=arr1[i];
            }
            double GPA = x/num;
            System.out.printf("%.2f",GPA);
        }
    }
}
