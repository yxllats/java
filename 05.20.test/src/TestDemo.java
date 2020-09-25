/**
 * Author: dts
 * DateTime: 2020/5/20 0:04
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3,0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        System.out.println(list.get(4));
    }
}
