/**
 * Author: dts
 * DateTime: 2020/4/26 1:17
 * Description: 单链表
 */
class Node {
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }
    public int get(int index) {
        Node pre = this.head;
        while(index>0){
            index--;
            pre = pre.next;
        }
        return pre.data;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //单链表长度
    public int size() {
        Node cur = this.head;
        int sum = 0;
        while (cur != null) {
            cur = cur.next;
            sum++;
        }
        return sum;
    }
    public void deleteAtIndex(int index) {
        if(index==0){
            this.head=this.head.next;
            return;
        }
        if(index>0||index<size()){
            Node pre = this.head;
            while(index-1>0) {
                pre = pre.next;
                index--;
            }
            pre.next=pre.next.next;
        }
    }

    //返回index-1位置的节点
    public Node searchIndex(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("位置异常");
        }
        Node cur = this.head;
        while ((index - 1) != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入数据
    public void addIndex(int index, int data) {
        if (index == 0) {
            this.addFirst(data);
        } else if (index == this.size()) {
            this.addLast(data);
        } else {
            Node node = new Node(data);
            Node cur = this.searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }

    //判断单链表中是否含有key的数据
    public boolean addIndex(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;
    }

    //删除第一次出现key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllkey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //清除单链表
    public void clear() {
        this.head = null;
    }

    //反转单链表
    public Node reverseList() {
        Node prev = null;
        Node cur = this.head;
        Node newHead = null;
        Node curNext = null;
        while (cur != null) {
            curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    //返回中间节点的节点
    public Node middleNode() {
        Node fast = this.head;
        Node low = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }

    //打印含参单链表
    public void display(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //返回倒数第k个节点
    public Node FindKthToTail(int k) {
        if (this.head == null) {
            return null;
        }
        if (k <= 0) {
            return null;
        }
        Node fast = this.head;
        Node low = this.head;
        while (k - 1 > 0) {
            fast = fast.next;
            k--;
        }
        if (fast == null) {
            return null;
        } else {
            while (fast.next != null) {
                fast = fast.next;
                low = low.next;
            }
        }
        return low;
    }

    //排序单链表x为比较值
    public Node partition(int x) {
        if (this.head == null) {
            return null;
        }
        Node cur = this.head;
        Node st1 = null;
        Node ed1 = null;
        Node st2 = null;
        Node ed2 = null;
        while (cur != null) {
            if (st1 == null && cur.data < x) {
                st1 = cur;
                ed1 = st1;
            } else if (st2 == null && cur.data >= x) {
                st2 = cur;
                ed2 = st2;
            } else {
                if (cur.data < x) {
                    ed1.next = cur;
                    ed1 = cur;
                } else {
                    ed2.next = cur;
                    ed2 = cur;
                }
            }
            cur = cur.next;
        }
        if (st1 == null) {
            return st2;
        }
        ed1.next = st2;
        if (ed2 != null) {
            ed2.next = null;
        }
        return st1;
    }

    //删除所有重复的节点
    public Node deleteDuplication() {
        if (this.head == null) {
            return null;
        }
        Node newHead = new Node(-1);
        Node temp = newHead;
        Node cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                newHead.next = cur;
                newHead = newHead.next;
                cur = cur.next;
            }
        }
        newHead.next = null;
        return temp.next;
    }

    //单链表的回文结构
    public boolean chkPalindrome() {
        if (this.head == null) {
            return false;
        }
        if (this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        while (this.head != slow) {
            if (this.head.data != slow.data) {
                return false;
            }
            if (this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

    //环形链表
    public boolean hasCycle() {
        if (this.head == null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //环形链表的入口节点
    public Node detectCycle() {
        if (this.head == null) {
            return null;
        }
        if (this.head.next == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == slow && fast != null) {
            Node cur = this.head;
            while (slow != cur) {
                cur = cur.next;
                slow = slow.next;
            }
            return cur;
        }
        return null;
    }

    //链表的交点
    public Node getIntersectionNode(Node headA, Node headB) {
        int countA = 0;
        int countB = 0;
        Node cur1 = headA;
        Node cur2 = headB;
        while (cur1 != null) {
            cur1 = cur1.next;
            countA++;
        }
        while (cur2 != null) {
            cur2 = cur2.next;
            countB++;
        }
        cur1 = headA;
        cur2 = headB;
        int count = countA - countB;
        if (count < 0) {
            cur2 = headA;
            cur1 = headB;
            count = countB - countA;
        }
        while (count > 0) {
            cur1 = cur1.next;
            count--;
        }
        while (cur1 != null && cur2 != null) {
            if (cur1 == cur2) {
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }

    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            } else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
            if (headA != null) {
                tmp.next = headA;
            }
            if (headB != null) {
                tmp.next = headB;
            }
        }
        return newHead.next;
    }
}




























