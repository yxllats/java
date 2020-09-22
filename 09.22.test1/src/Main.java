import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T>0){
            int N = in.nextInt();
            int M = in.nextInt();
            int N_1 = 0;
            int M_1 = 0;
            int max = Math.max(N,M);
            int i = 1;
            while (i<=max){
                if(i%2!=0&&i<=N){
                    N_1++;
                }
                if(i%2!=0&&i<=M){
                    M_1++;
                }
                i++;
            }
            int sum = N_1 * (M - M_1) + (N - N_1) * M_1;
            int SUM = M * N;
            if(sum==0){
                System.out.println(sum+"/"+SUM);
            }else {
                int n = getNum(sum,SUM);
                sum = sum/n;
                SUM = SUM/n;
                System.out.println(sum+"/"+SUM);
            }
            T--;
        }
        in.close();
    }
    public static int getNum(int a,int b){
        int c = a%b;
        while (c>0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
}
