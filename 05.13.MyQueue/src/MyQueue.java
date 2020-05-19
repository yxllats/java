/**
 * Author: dts
 * DateTime: 2020/5/13 19:36
 * Description: TODO
 */
class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data =data;
    }
}
public class MyQueue {
    public Node front ;
    public Node rear ;

    public boolean offer(int data) {
        Node node = new Node(data);
        if(this.rear==null) {
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        return true;
    }
}
