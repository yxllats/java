/**
 * Author: dts
 * DateTime: 2020/6/1 23:12
 * Description: TODO
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null) {
            stack.push(root);
            root = root.left;
        }
        TreeNode head = stack.pop();
        TreeNode cur = head;
        while(!stack.isEmpty()){
            cur.right = stack.pop();
            cur = cur.right;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer();
        queue.poll()
    }
}