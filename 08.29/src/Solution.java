public class Solution {
    public static void main(String[] args) {
        /*int max = Integer.MAX_VALUE;
        boolean aa  = true;
        System.out.println(aa);
        int a =10;
        String string = String.valueOf(a);
        System.out.println(string);
        int b = Integer.parseInt(string);
        System.out.println(b);
        int[] arr = {1,2,3,4};
        String string = Arrays.toString(arr);
        //System.out.println(string);
        int[] array = Arrays.copyOf(arr,arr.length*2);
        System.out.println(Arrays.toString(array));
         */
    }
    //找链表中间结点
    public class ListNode {
     int val;
     ListNode next;
      ListNode(int x) { val = x; }
   }
    public ListNode middleNode(ListNode head) {
        ListNode p = head, q = head;
        while (q != null && q.next != null) {
            q = q.next.next;
            p = p.next;
        }
        return p;
    }
}
