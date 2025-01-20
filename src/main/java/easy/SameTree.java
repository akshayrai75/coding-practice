package easy;

import easy.nodes.TreeNode;

public class SameTree {
    /**
     * <b>Same Tree</b><br>
     * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
     * @Example-1:
     * Input: p = [1,2,3], q = [1,2,3]<br>
     * Output: true
     * @Example-2:
     * Input: p = [1,2], q = [1,null,2]<br>
     * Output: false
     * @Example-3:
     * Input: p = [1,2,1], q = [1,1,2]<br>
     * Output: false
     * */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) return false;
        boolean[] isEqual = new boolean[]{true};
        traverseInorder(p,q,isEqual);
        return isEqual[0];
    }
    // Following beats 100% in TC and 5.7% in SC.
    private static void traverseInorder(TreeNode pnode, TreeNode qnode, boolean[] isEqual) {
        if (pnode == null && qnode == null) return;
        if (pnode != null && qnode != null && pnode.val != qnode.val) {
            isEqual[0] = false;
            return;
        }
        if ((pnode.left == null && qnode.left != null) ||
                (pnode.left != null && qnode.left == null) ||
                (pnode.right == null && qnode.right != null) ||
                (pnode.right != null && qnode.right == null)
        ) {
            isEqual[0] = false;
            return;
        }
        traverseInorder(pnode.left, qnode.left, isEqual);
        traverseInorder(pnode.right, qnode.right, isEqual);
    }
}
