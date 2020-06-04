/**
 * Author: dts
 * DateTime: 2020/6/1 22:02
 * Description: TODO
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null){
            return true;
        }
        LinkedList<TreeNode> link = new LinkedList<>();
        TreeNode cur = null;
        link.add(root);
        while((cur=link.removeFirst())!=null){
            link.add(cur.left);
            link.add(cur.right);
        }
        while (!link.isEmpty()){
            if(link.removeFirst()!=null){
                return false;
            }
        }
        return true;
    }
}