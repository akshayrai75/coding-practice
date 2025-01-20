import easy.BinaryTreeInorderTraversal;
import easy.SameTree;
import easy.nodes.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode testPRoot1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode testQRoot1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(SameTree.isSameTree(testPRoot1, testQRoot1));

        TreeNode testPRoot2 = new TreeNode(2,
                new TreeNode(2,null, new TreeNode(2)),
                new TreeNode(2,null, new TreeNode(2))
        );
        TreeNode testQRoot2 = new TreeNode(2,
                new TreeNode(2, new TreeNode(2), null),
                new TreeNode(2, new TreeNode(2), null)
        );
        System.out.println(SameTree.isSameTree(testPRoot2, testQRoot2));
        TreeNode testPRoot3 = null;
        TreeNode testQRoot3 = new TreeNode(0);
        System.out.println(SameTree.isSameTree(testPRoot3, testQRoot3));
    }
}