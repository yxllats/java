/**
 * Author: dts
 * DateTime: 2020/4/21 18:16
 * Description: 顺序表
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(0,15);
        list.add(0,23);
        list.add(2,78);
        list.display();
        System.out.println(list.contains(23));
        System.out.println(list.search(78));
        System.out.println(list.getPos(2));
        list.setPos(2,98);
        list.display();
        list.remove(98);
        list.display();
        System.out.println(list.size());
        list.clear();
        list.display();
    }
}
