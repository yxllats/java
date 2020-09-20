import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(";");
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = strings[i].charAt(j);
                if(ch=='.'){
                    arr[i][j] = 0;
                }else {
                    arr[i][j] = ch - '0';
                }
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int k = 0; k < 9; k++) {
            for (int j = 0; j < 9; j++) {
                if (arr[k][j] != 0) {
                    if (map.containsKey(arr[k][j])) {
                        map.put(arr[k][j], map.get(k) + 1);
                        System.out.println("false");
                        return;
                    } else {
                        map.put(k, 1);
                    }
                }
            }
            for (int j = 0; j < 9; j++) {
                if(arr[j][k]!=0) {
                    if (map.containsKey(arr[j][k])) {
                        map.put(arr[j][k], map.get(k) + 1);
                        System.out.println("false");
                        return;
                    } else {
                        map.put(k, 1);
                    }
                }
            }
        }
        for (int i = 1; i < 9; i++) {
            if (map.get(i)>1){
                System.out.println("false");
                return;
            }
        }
    }
}
