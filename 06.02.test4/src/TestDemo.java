import java.util.Arrays;
import java.util.Comparator;

/**
 * Author: dts
 * DateTime: 2020/6/2 23:07
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        Integer[] a = {1,3,2,5,4,9,6};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        StringBuffer str = new StringBuffer();
        str.append('a');
        str.append('a');
        str.append('a');
        str.toString().s
    }
}
