class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Main {
    public void Mirror(TreeNode root) {
        exchange(root);
    }
    public void exchange(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        exchange(root.left);
        exchange(root.right);
    }
}


/*public class Main{
    public static void main(String[] args) {
        Integer t1 = 121;
        Integer t2 = 121;
        Integer t3 = new Integer(121);
        Integer t4 = new Integer(121);
        Integer t5 = new Integer(210);
        Integer t6 = new Integer(210);
        Integer t7 = 210;
        Integer t9 = 210;
        Integer t8 = new Integer(210);
        System.out.println(t9 == t7);
        /*System.out.println(t1 == t2);

        System.out.println(t3 == t4);
        System.out.println(t5 == t6);
        System.out.println(t7 == t8);
    }
}*/