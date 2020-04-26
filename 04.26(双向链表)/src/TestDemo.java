/**
 * Author: dts
 * DateTime: 2020/4/26 18:34
 * Description: 双向链表
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(22);
        list.addFirst(33);
        list.addFirst(44);
        list.addFirst(100);
        list.addLast(100);
        list.addLast(55);
        list.addIndex(2,100);
        list.addIndex(2,300);
        System.out.println(list.remove(55));
        System.out.println(list.remove(33));
        list.removeAllkey(100);
        list.display();
        System.out.println(list.contains(4));
        System.out.println(list.size());
    }
}