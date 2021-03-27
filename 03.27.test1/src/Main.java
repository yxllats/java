import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String string = in.nextLine();
        String[] strings1 = str.split(" ");
        int m = Integer.parseInt(strings1[1]);
        int n = Integer.parseInt(strings1[0]);

        int[] array = new int[n];
        String[] strings2 = string.split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(strings2[i]);
        }
        while (m>0){
            int num = in.nextInt();
            getIndex(array,num);
            m--;
        }
    }
    public static void getIndex(int[] arr,int num){
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map2.put(arr[i],i+1);
            if(!map1.containsKey(arr[i])){
                map1.put(arr[i],i+1);
            }
            if(map2.containsKey(arr[i])){
                map2.put(arr[i],i+1);
            }
        }
        if(map1.containsKey(num)){
            System.out.println(map1.get(num)+" "+map2.get(num));
        }else {
            System.out.println(0);
        }
    }
}
