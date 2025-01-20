package easy;

import easy.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    /**
     * <b>Binary Tree Inorder Traversal</b><br>
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     * @Example-1:
     * Input: root = [1,null,2,3]<br>
     * Output: [1,3,2]<br>
     * Explanation:
     * <br>     1
     * <br>      \
     * <br>       2
     * <br>      /
     * <br>     3
     * @Example-2:
     * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]<br>
     * Output: [4,2,6,5,7,1,3,9,8]<br>
     * Explanation:
     * @Example-3:
     * Input: root = []<br>
     * Output: []<br>
     * @Example-4:
     * Input: root = [1]<br>
     * Output: [1]<br>
     * */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverseInorder(root,ans);
        return ans;
    }

    // Beats 100% in TC and only 7.7% in SC
    private static void traverseInorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        traverseInorder(node.left, list);
        list.add(node.val);
        traverseInorder(node.right, list);

    }
}
