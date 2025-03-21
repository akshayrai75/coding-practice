package util;

import easy.nodes.TreeNode;

public class PrintTree {
    public static void printInOrder(TreeNode root) {
        if (root == null) {
//            System.out.print("null, ");
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val +", ");
        printInOrder(root.right);
    }
    public static void printPreOrder(TreeNode root) {
        if (root == null) {
//            System.out.print("null, ");
            return;
        }
        System.out.print(root.val +", ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public static void printPostOrder(TreeNode root) {
        if (root == null) {
//            System.out.print("null, ");
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.val +", ");
    }
}
