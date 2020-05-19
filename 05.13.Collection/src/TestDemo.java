import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Author: dts
 * DateTime: 2020/5/13 16:03
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("i");
        list.add(" ");
        list.add("am");
        list.add(" ");
        list.add("a");
        System.out.println(list.isEmpty());
        System.out.println(list);
        list.remove("a");
        System.out.println(list);
        System.out.println(list.size());
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
