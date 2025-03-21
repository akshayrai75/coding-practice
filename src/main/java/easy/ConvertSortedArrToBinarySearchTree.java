package easy;

import easy.nodes.TreeNode;

public class ConvertSortedArrToBinarySearchTree {
    /**
     * <b>Convert Sorted Array To Binary Search Tree</b><br>
     * Given an integer array nums where the elements are sorted in <i>ascending order</i>, convert it to a
     * <i>height-balanced</i> binary search tree.
     * @Example-1:
     * Input: nums = [-10,-3,0,5,9]<br>
     * Output: [0,-3,9,-10,null,5]<br>
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
     * @Example-2:
     * Input: nums = [1,3]<br>
     * Output: [3,1]<br>
     * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
     * */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) return new TreeNode(nums[0]);
        int mid = nums.length/2;
        return topDown(nums, 0, nums.length -1);
    }

    private static TreeNode topDown (int[] nums, int l, int r) {
        if(l > r) return null;
        int mid = (l + r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = topDown(nums, l, mid-1);
        root.right = topDown(nums, mid+1, r);
        return root;
    }
}
