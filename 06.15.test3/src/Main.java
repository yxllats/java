import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/15 23:40
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        while (in.hasNext()){
            StringBuffer stringBuffer = new StringBuffer();
            int n = in.nextInt();
            for (int i = 0; i < 10000000; i++) {
                if(Math.pow(n,3)==n*(i-1)+Math.pow(n,2)){
                    stringBuffer.append(i);
                    for (int j = 1; j < n; j++) {
                        stringBuffer.append('+');
                        stringBuffer.append(i+2*j);
                    }
                    break;
                }
            }
            System.out.println(stringBuffer.toString());
        }

    }
}
