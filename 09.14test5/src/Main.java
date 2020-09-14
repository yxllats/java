import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.charAt(0);
        int m = str.charAt(1);
        List<Queue<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            list.add(queue);
        }

        String[] strings = new String[m];
        for (int i = 0; i < m; i++) {

            strings[i] = in.nextLine();
        }
        for (int i = 0; i < m; i++) {
            Queue<Integer> queue = new LinkedList<>();
            char ch = strings[i].charAt(0);
            int a = strings[i].charAt(2)-'0';
            int b = strings[i].charAt(4)-'0';
            int index_a = 0;
            int index_b = 0;
            int get = 0;
            if(ch=='Q'){
                while (list.get(a-1).size()>0){
                    list.get(b-1).add(list.get(a-1).poll());
                }
            }else {
                for (int j = 0; j < n; j++) {
                    queue =list.get(j);
                    while (queue.size()>0){
                        Iterator<Integer> it = queue.iterator();
                        int k = 0;
                        while (it.hasNext()){
                            k++;
                            Integer c = it.next();
                            if(c==a){
                                index_a= k;
                            }else if(c==b){
                                index_b = k;
                            }
                        }
                        if((index_a==0&&index_b!=0)||(index_a!=0&&index_b==0)){
                            get = -1;
                            break;
                        }else if(index_a!=0&&index_b!=0) {
                            get = index_a - index_b;
                            if(get<0){
                                get = -get;
                            }
                        }
                    }
                    if(get!=0){
                        break;
                    }
                }
                System.out.println(get);
            }
        }
    }
}
