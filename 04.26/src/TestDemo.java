/**
 * Author: dts
 * DateTime: 2020/4/26 1:16
 * Description: 单链表
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addIndex(0,10);
        list.addIndex(0,20);
        list.addIndex(1,30);
        list.display();
        System.out.println(list.get(0));
    }
}
