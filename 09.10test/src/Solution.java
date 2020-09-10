 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public TreeNode getTree(int[] pre, int k, int[] in, int start, int end){
        if(start>end){
            return null;
        }
        int index = 0;
        for(int i=start;i<=end;i++){
            if(in[i]==pre[k]){
                index = i;
            }
        }
        TreeNode root = new TreeNode(in[index]);
        root.left = getTree(pre,k+1,in,start,index-1);
        root.right = getTree(pre,k+1+index-start,in,index+1,end);
        return root;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return getTree(pre,0,in,0,in.length-1);
    }
}