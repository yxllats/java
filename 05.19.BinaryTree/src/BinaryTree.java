import java.util.ArrayList;
import java.util.List;

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
}
