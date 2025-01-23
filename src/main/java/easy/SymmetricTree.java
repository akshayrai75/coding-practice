package easy;

import easy.nodes.TreeNode;

public class SymmetricTree {
    /**
     * <b>Symmetric Tree</b>
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     * @Example-1:
     * Input: root = [1,2,2,3,4,4,3]<br>
     * Output: true<br>
     * @Example-2:
     * Input: root = [1,2,2,null,3,null,3]<br>
     * Output: false<br>
     * */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right==null)) return true;

        boolean[] isSame = new boolean[]{true};
        isMirror(root.left, root.right, isSame);

        return isSame[0];
    }

    //Below beats 100% in TC and 67% in SC
    public static void isMirror(TreeNode lftNode, TreeNode rtTree, boolean[] isSame) {
        if (lftNode == null && rtTree == null) return;
        if ((lftNode == null && rtTree != null)||(lftNode != null && rtTree == null)) {
            isSame[0] = false;
            return;
        }
        isMirror(lftNode.left, rtTree.right, isSame);
        if (lftNode.val != rtTree.val) {
            isSame[0] = false;
            return;
        }
        isMirror(lftNode.right, rtTree.left, isSame);
    }

    // Below code passed 198/199 Test cases.
    // Failed Test case : [5,4,1,null,1,null,4,2,null,2,null]
    /*public static boolean isSymmetric2(TreeNode root) {
        if (root == null || (root.left == null && root.right==null)) return true;
        List rtTree = new ArrayList<Integer>();
        List lftTree = new ArrayList<Integer>();
        inOrderTraverse(root.left, lftTree);
        reverseOrderTraverse(root.right, rtTree);
        lftTree.forEach(System.out::print);
        System.out.println();
        rtTree.forEach(System.out::print);
        System.out.println();
        return rtTree.equals(lftTree);
    }
    private static void inOrderTraverse(TreeNode node, List<Integer> lftTree){
        if (node == null) return;
        inOrderTraverse(node.left, lftTree);
        if (node.right != null && node.left == null) lftTree.add(-999);
        lftTree.add(node.val);
        if (node.right == null && node.left != null) lftTree.add(-999);
        inOrderTraverse(node.right,lftTree);
    }
    private static void reverseOrderTraverse(TreeNode node, List<Integer> rtTree){
        if (node == null) return;
        reverseOrderTraverse(node.right, rtTree);
        if (node.right == null && node.left != null) rtTree.add(-999);
        rtTree.add(node.val);
        if (node.right != null && node.left == null) rtTree.add(-999);
        reverseOrderTraverse(node.left,rtTree);
    }*/
}
