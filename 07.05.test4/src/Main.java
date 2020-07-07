import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/7/5 19:59
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
        while(in.hasNext()){
            String str=in.next();
            int line=in.nextInt();
            String[] arr=str.split("\\\\");
            String s=arr[arr.length-1];
            if(s.length()>16)  //截取
                s=s.substring(s.length()-16);
            String key=s+" "+line;
            int value=1;
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else {
                map.put(key, value);
            }
        }
        int count=0;
        for(String str:map.keySet()) {
            count++;
            if (count > (map.keySet().size() - 8))
                System.out.println(str + " " + map.get(str));
        }
    }
}
