import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();

        int[] pi = new int[p];
        int[] qi = new int[q];

        HashMap<Integer,Integer> map_p = new HashMap<>();
        for (int i = 0; i < p; i++) {
            pi[i] = in.nextInt();
            map_p.put(pi[i],1);
        }

        HashMap<Integer,Integer> map_q = new HashMap<>();
        for (int i = 0; i < q; i++) {
            qi[i] = in.nextInt();
            map_q.put(qi[i],1);
        }

        int get_A = 0;
        int get_B = 0;
        int all = 0;

        for (int i = 0; i < p; i++) {
            if(!map_q.containsKey(pi[i])){
                get_A++;
            }else {
                all++;
            }
        }

        for (int i = 0; i < q; i++) {
            if(!map_p.containsKey(qi[i])){
                get_B++;
            }
        }
        System.out.println(get_A+" "+get_B+" "+all);
    }
}