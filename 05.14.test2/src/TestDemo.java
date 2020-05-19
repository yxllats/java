import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Author: dts
 * DateTime: 2020/5/14 16:17
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(18);
        list.add(44);
        list.add(33);
        list.add(11);
        Collections.sort(list);
        System.out.println(list);

    }
}
