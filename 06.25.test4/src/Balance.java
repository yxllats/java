import java.util.*;
/**
 * Author: dts
 * DateTime: 2020/6/25 21:34
 * Description: TODO
 */



class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public static int get_High(TreeNode root){
        if(root == null){
            return  0;
        }
        int left_high = get_High(root.left);
        int right_high = get_High(root.right);

        return left_high>right_high? left_high+1:right_high+1;
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        int n = get_High(root.left)-get_High(root.right);
        if(n<-1||n>1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }
}