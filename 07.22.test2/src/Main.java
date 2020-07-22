import java.util.*;

public class Main {
    public static boolean fun(String dic,String word) {
        if(dic.equals(word)||dic.length()!=word.length()){
            return false;
        }
        char[] wordChar = word.toCharArray();
        char[] dicChar = dic.toCharArray();
        Arrays.sort(dicChar);
        Arrays.sort(wordChar);
        if(Arrays.equals(wordChar,dicChar)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            TreeSet<String> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(in.next());
            }
            List<String> list = new LinkedList<>();
            String word = in.next();
            int num = in.nextInt();
            Iterator<String> it = set.iterator();
            int sum = 0;
            while (it.hasNext()){
                String dic = it.next();
                if(fun(dic,word)){
                    sum++;
                    if(num>0){
                        list.add(dic);
                        num--;
                    }
                }

            }
            System.out.println(sum);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
