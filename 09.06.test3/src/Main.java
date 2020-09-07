import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] an = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            boolean flag = true;

            for (int i = 0; i < n; i++) {
                an[i] = in.nextInt()-1;
                if(an[i]==0){
                    if(map.containsKey(1)){
                        map.put(1,map.get(an[i])+1);
                    }else {
                        map.put(1,1);
                    }
                }if(an[i]==1){
                    flag = false;
                }else {
                    if(map.containsKey(an[i])){
                        map.put(an[i],map.get(an[i])+1);
                    }else {
                        map.put(an[i],1);
                    }
                }
            }

            if(flag == false){
                System.out.println("NO");
            }else {

            }
        }
    }
}
