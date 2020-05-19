/**
 * Author: dts
 * DateTime: 2020/5/19 14:53
 * Description: TODO
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree();
        tree.preOrderTraversal(root);
        System.out.println();
        tree.inOrderTraversal(root);
        System.out.println();
        tree.postOrderTraversal(root);
        System.out.println(tree.getKLevelSize(root, 3));
    }
}

