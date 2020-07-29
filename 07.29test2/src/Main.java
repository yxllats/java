class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            }else {
                head.next = list2;
                head = head.next;
                list2= list2.next ;
            }
        }
        if(list1==null){
            head.next = list2;
        }
        if(list2==null){
            head.next = list1;
        }
        return cur.next;
    }

    public static void main(String[] args) {

    }
}