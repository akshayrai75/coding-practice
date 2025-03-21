import easy.ConvertSortedArrToBinarySearchTree;
import easy.MaxDepthBinaryTree;
import easy.SymmetricTree;
import easy.nodes.TreeNode;
import util.PrintTree;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{-10,-3,0,5,9};
        TreeNode tree1 = ConvertSortedArrToBinarySearchTree.sortedArrayToBST(test1);
        int[] test2 = new int[]{1,3};
        TreeNode tree2 = ConvertSortedArrToBinarySearchTree.sortedArrayToBST(test2);
        int[] test3 = new int[]{1,1,1,1,1,1,1,1,1};
        TreeNode tree3 = ConvertSortedArrToBinarySearchTree.sortedArrayToBST(test3);

        PrintTree.printInOrder(tree1);
        System.out.println();
        PrintTree.printInOrder(tree2);
        System.out.println();
        PrintTree.printInOrder(tree3);
    }
}