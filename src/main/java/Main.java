import easy.MaxDepthBinaryTree;
import easy.SymmetricTree;
import easy.nodes.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode testRoot1 = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        TreeNode testRoot2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)
                        ),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)
                        )
        );
        TreeNode testRoot3 = new TreeNode(1,
                new TreeNode(2,null, new TreeNode(2)),
                new TreeNode(2,null, new TreeNode(2))
        );
        TreeNode testRoot4 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(2, new TreeNode(3), null)
        );
        TreeNode testRoot5 = null;
        TreeNode testRoot6 = new TreeNode(0);

        TreeNode testRoot7 = new TreeNode(2,
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(5, new TreeNode(8), new TreeNode(9))),
                new TreeNode(3,
                        new TreeNode(5, new TreeNode(9), new TreeNode(8)),
                        new TreeNode(4))
        );

        TreeNode testRoot8 = new TreeNode(5,
                new TreeNode(4,
                        null,
                        new TreeNode(1, new TreeNode(2), null)),
                new TreeNode(1,
                         null,
                        new TreeNode(4, new TreeNode(2), null))
        );

        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot1));
        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot2));
        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot3));
        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot4));
        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot5));
        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot6));

        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot7));
        System.out.println(MaxDepthBinaryTree.maxDepth(testRoot8));
    }
}