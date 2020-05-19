/**
 * Author: dts
 * DateTime: 2020/5/15 13:10
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        A<Integer> a = new A<Integer>(22);
        A<String> b = new A<String>("abc");
        A<Character> c = new A<Character>('h');
        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(c.get());
    }
}
