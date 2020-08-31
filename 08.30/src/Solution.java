class Node{
    int val;
    Node next;
    public Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    /*public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
        System.out.println(list);
    }*/
    public Node head = null;
    public Node tail = null;

    public void offer(int v) {
        Node node = new Node(v);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public int poll() {
        if (head == null) {
            throw new RuntimeException("队列为空");
        }
        Node node = head;
        head = head.next;
        if(head==null){
            tail=null;
        }
        return node.val;
    }

    public int peek() {
        if (head == null) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }


    public static void main(String[] args) {

    }
}
