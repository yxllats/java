
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.size()>0){
            TreeNode node = queue.poll();
            if(node==null){
                continue;
            }
            list.add(node.val);
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return list;

    }
}