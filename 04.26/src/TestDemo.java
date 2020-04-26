/**
 * Author: dts
 * DateTime: 2020/4/26 1:16
 * Description: 单链表
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(22);
        list.addFirst(44);
        list.addLast(33);
        list.addLast(66);
        list.addLast(66);
        list.addFirst(66);
        list.display();
        list.addIndex(2,100);
        list.addIndex(3,200);
        list.display();
        System.out.println(list.size());
        list.remove(22);
        list.display();
        list.removeAllkey(66);
        list.display();
        Node ret = list.reverseList();
        list.display(ret);

    }
}
