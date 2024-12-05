package easy;

public class SearchInsertPos {
    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
     * return the index where it would be if it were inserted in order.<br>
     * You must write an algorithm with O(log n) runtime complexity.<br>
     * @Example 1:
     * Input: nums = [1,3,5,6], target = 5<br>
     * Output: 2<br>
     * @Example 2:
     * Input: nums = [1,3,5,6], target = 2<br>
     * Output: 1<br>
     * @Example 3:<br>
     * Input: nums = [1,3,5,6], target = 7<br>
     * Output: 4<br>
     * @Constraints:
     * 1 <= nums.length <= 104<br>
     * -104 <= nums[i] <= 104<br>
     * nums contains distinct values sorted in ascending order.<br>
     * -104 <= target <= 104<br>
     * */
    public static int searchInsert(int[] nums, int target) {
        int arrLen = nums.length;
        int fPos = 0;
        int lPos = arrLen -1;
        int mPos = lPos/2;
        if (arrLen == 1 && nums[0] == target) return 0;
        if (nums[lPos] < target) return lPos+1;
        if (nums[lPos] == target) return lPos;
        if (nums[fPos] >= target) return 0;

        while (mPos >= fPos && mPos <= lPos) {
            if (nums[mPos] == target) return mPos;
            else if (nums[mPos] < target) {
                if (mPos < lPos && nums[mPos+1] >= target) return (mPos+1) ;
                else if (mPos == lPos && nums[mPos] < target) return lPos+1;
                else {
                    fPos = mPos;
                    mPos = (lPos - fPos)/2 + mPos;
                }
            }
            else if (nums[mPos] > target) {
                if (mPos > fPos ) {
                    if (nums[mPos-1] == target) return mPos - 1;
                    else if (nums[mPos - 1] < target) return mPos;
                }
                else if (nums[mPos] > target) return fPos;
                lPos = mPos;
                mPos = (lPos - fPos)/2 + fPos;

            }
        }
        if (target >= nums[mPos]) return mPos;
        else return 0;
    }
}
