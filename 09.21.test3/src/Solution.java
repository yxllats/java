import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static ArrayList<Integer> mergerArrays (ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        // write code here
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> it = arrayA.iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (it.hasNext()){
            set.add(it.next());
        }
        it = arrayB.iterator();
        while (it.hasNext()){
            int n = it.next();
            if(!set.add(n)){
                list.add(n);
            }
        }

        return list;
    }

    public static void main(String[] args) {
    }
}
