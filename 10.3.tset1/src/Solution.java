import java.util.ArrayList;

 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
public class Solution {
    public ArrayList<ArrayList<Integer>> list_ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        getPath(new ArrayList<>(),root,target);
        return list_ret;
    }
    public void getPath(ArrayList<Integer> list,TreeNode root,int target){
        if(root==null){
            return;
        }
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            list_ret.add(new ArrayList<>(list));
        }else {
            getPath(list,root.left,target);
            getPath(list,root.right,target);
        }
        list.remove(list.size() - 1);
    }
}