/**
 * Author: dts
 * DateTime: 2020/5/20 0:04
 * Description: TODO
 */
class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        Node head = null;
    }

    public int size(){
        int sum = 0;
        Node pre =this.head;
        while(pre!=null){
            sum++;
            pre = pre.next;
        }
        return sum;
    }


    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node pre = this.head;
        if(index<0||index>=size()) {
            return -1;
        }
        while(index>0){
            index--;
            pre = pre.next;
        }
        return pre.val;
    }
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(this.head==null) {
            this.head = node;
        }else{
            node.next =this.head;
            this.head = node;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(this.head==null) {
            this.head = node;
            return;
        }
        Node pre = this.head;
        while(pre.next!=null){
            pre = pre.next;
        }
        pre.next = node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>size()){
            return;
        }
        if(index==size()){
            addAtTail( val);
            return;
        }
        if(index<=0){
            addAtHead( val);
            return;
        }
        Node pre = this.head;
        Node node = new Node(val);
        while(index-1>0){
            pre = pre.next;
            index--;
        }
        node.next = pre.next;
        pre.next = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index==0){
            this.head=this.head.next;
            return;
        }
        if(index>0&&index<size()){
            Node pre = this.head;
            while(index-1>0) {
                pre = pre.next;
                index--;
            }
            pre.next=pre.next.next;
        }
    }
}