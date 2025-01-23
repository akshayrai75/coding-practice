package easy;

import easy.nodes.TreeNode;

public class MaxDepthBinaryTree {
    /**
     * <b>Maximum Depth of Binary Tree</b>
     * Given the root of a binary tree, return its maximum depth. <br>
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to
     * the farthest leaf node.
     * @Example-1:
     * Input: root = [3,9,20,null,null,15,7]<br>
     * Output: 3
     * @Example-2:
     * Input: root = [1,null,2]<br>
     * Output: 2
     * */
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int maxDepth[] = new int[]{1,1};
        int currLvl = 1;
        goDeep(root, currLvl, maxDepth);
        return maxDepth[1];
    }

    //Beats 100% in TC and 86.5% in SC
    private static void goDeep(TreeNode node, int currLvl, int[] maxDepth) {
        if (node == null) return;
        maxDepth[0] = currLvl;
        if (maxDepth[0] > maxDepth[1]) maxDepth[1] = maxDepth[0];
        goDeep(node.left, currLvl + 1, maxDepth);
        goDeep(node.right, currLvl + 1, maxDepth);
    }
}
