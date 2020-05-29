import java.util.*;

/**
 * Author: dts
 * DateTime: 2020/5/19 14:54
 * Description: TODO
 */
class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val){
        this.val = val;
    }
}

public class BinaryTree {
    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }
    //前序遍历
    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //中序遍历
    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }

    //后序遍历
    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    //遍历求结点个数
    static int size = 0;
    public void getSize(Node root){
        if(root == null){
            return;
        }
        getSize(root.left);
        size++;
        getSize(root.right);
    }

    //子问题求结点个数
    public int getSize2(Node root){
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(Node root){
        if(root == null) {
            return;
        }
        if(root.left == null && root.right==null){
            leafSize++;
        }else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right==null){
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }

     // 获取二叉树的高度
     public int getHeight(Node root) {
         if (root == null) {
             return 0;
         }
         int left_high = getHeight(root.left);
         int right_high = getHeight(root.right);
         return left_high> right_high?left_high+1: right_high+1;
     }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找  前序遍历的方式
    // 一旦找到，立即返回，不需要继续在其他位置查找
    public Node find(Node root, char val) {
        if (root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        Node node_left = find(root.left,val);
        if(node_left==null){
            return   find(root.right,val);
        }
        return node_left;
    }

    // 层序遍历
    public void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur!=null) {
                System.out.print(cur.val+" ");
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
    }

    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(Node root){
        if(root==null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node cur = queue.poll();
        while(cur!=null) {
            queue.offer(cur.left);
            queue.offer(cur.right);
            cur = queue.poll();
        }


        while(!queue.isEmpty()){
            Node pre = queue.poll();
            if(pre!=null){
                return false;
            }
        }
        return true;
    }

    // 前序遍历
    public void preOrderTraversalNor(Node root){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }

    // 中序遍历
    public void inOrderTraversalNor(Node root){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
        System.out.println();
    }

    // 后序遍历
    public void pastOrderTraversalNor(Node root){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                System.out.print(cur.val+" ");
                stack.pop();
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        System.out.println();
    }
}
