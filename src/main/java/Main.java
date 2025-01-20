import easy.BinaryTreeInorderTraversal;
import easy.nodes.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode testRoot1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3),null));
        List ans1 = BinaryTreeInorderTraversal.inorderTraversal(testRoot1);
        ans1.forEach(System.out::print);


    }
}