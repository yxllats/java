import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map=new LinkedHashMap<>();
        while(in.hasNext()){
            String str = in.next();
            int linenum = in.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length-1];
            String key=s+" "+linenum;
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else {
                map.put(key, 1);
            }
        }
        int count=0;
        for(String string:map.keySet()){
            count++;
            if(count>(map.keySet().size()-8)) //输出最后八个记录
                //if(string.length()>16){
                  //  string = string.substring(string.length()-16);
                //}
                System.out.println(string+" "+map.get(string));
        }
    }
}