package easy;

public class MergeSortedArray {
    /**
     * <b>Merge Sorted Array</b>
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.<br>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.<br>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
     * should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.<br>
     * @Example-1:
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3<br>
     * Output: [1,2,2,3,5,6]<br>
     * <b>Explanation:</b> The arrays we are merging are [1,2,3] and [2,5,6].
     * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.<br>
     * @Example-2:
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0<br>
     * Output: [1]<br>
     * <b>Explanation:</b> The arrays we are merging are [1] and [].
     * The result of the merge is [1].<br>
     * @Example-3:
     * Input: nums1 = [0], m = 0, nums2 = [1], n = 1<br>
     * Output: [1]<br>
     * <b>Explanation:</b> The arrays we are merging are [] and [1].
     * The result of the merge is [1].
     * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
     * */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Following beats 100% in TC whereas only about 15% in SC
        int i=0, j=0, k=0;
        int[] ans = new int[nums1.length];
        while (i<m && j<n) {
            if (nums1[i] == nums2[j]) {
                ans[k++] = nums1[i++];
                ans[k++] = nums2[j++];
            } else if (nums1[i] > nums2[j]) ans[k++] = nums2[j++];
            else ans[k++] = nums1[i++];
        }
        if (i<m) while (i<m) ans[k++] = nums1[i++];
        if (j<n) while (j<n) ans[k++] = nums2[j++];

        for (int l = 0; l < ans.length; l++) {
            nums1[l] = ans[l];
        }
    }
}
