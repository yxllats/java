import java.util.ArrayList;
import java.util.List;

public class Main {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        List<List<Integer>> list = new ArrayList<>();
        /*for (int i = 0; i < list.size(); i++) {
            list.add(new ArrayList<Integer>());
        }*/
        list.get(0).add(triangle.get(0).get(0));
        for (int i = 1; i < triangle.size(); i++) {
            int curSum = 0;
            for (int j = 0; j <= i ; j++) {
                if(j==0){
                    curSum = list.get(i - 1).get(0);
                }else if(j==i){
                    curSum = list.get(i - 1).get(j - 1);
                }else {
                    curSum = Math.min(list.get(i - 1).get(j),list.get(i - 1).get(j - 1));;
                }
                list.get(i).add(triangle.get(i).get(j) + curSum);
            }
        }
        int size = triangle.size();
        int Min = list.get(size - 1).get(0);
        for(int i = 1; i < size; ++i) {
            Min = Math.min(Min, list.get(size - 1).get(i));
        }
        return Min;
    }
}
