/**
 * Author: dts
 * DateTime: 2020/4/26 18:37
 * Description: 双向链表
 */
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    public Node tail;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else {
           node.next = this.head;
           this.head.prev = node;
           this.head = node;
        }
    }

    //打印双向链表
    public void display() {
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.tail==null) {
            this.tail=node;
            this.head=node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    //查找是否包含数据
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //链表长度
    public int size() {
        Node cur = this.head;
        int sum = 0;
        while(cur != null){
            cur = cur.next;
            sum ++;
        }
        return sum ;
    }

    //判断位置合法性
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }

    //返回index的节点
    private Node searchIndex(int index) {
        Node cur = this.head;
        while(index>0){
            index--;
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入节点
    public void addIndex(int index,int data) {
        checkIndex(index);

        Node node = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == this.size()){
            addLast(data);
            return;
        }

        Node cur = searchIndex(index);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }

    //删除key值的节点
    public int remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    //删除所有key值的节点
    public void removeAllkey(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //清空链表
    public void clear() {
        while(this.head != null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
            cur = cur.next;
        }
        this.tail = null;
    }
}
