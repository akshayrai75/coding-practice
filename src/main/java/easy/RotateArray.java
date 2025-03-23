package easy;

import java.util.Arrays;

public class RotateArray {
    /**
     * <b>Rotate Array</b>
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.<br>
     * @Example-1:
     * Input: nums = [1,2,3,4,5,6,7], k = 3<br>
     * Output: [5,6,7,1,2,3,4]<br>
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]<br>
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]<br>
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]<br>
     * @Example-2:
     * Input: nums = [-1,-100,3,99], k = 2<br>
     * Output: [3,99,-1,-100]<br>
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]<br>
     * rotate 2 steps to the right: [3,99,-1,-100]<br>
     * */
    public static void rotate2(int[] nums, int k) {
        //Beats 50% in TC and 50% in SC
        int mod = k % nums.length;
        int sec[] = new int[mod];
        for (int i = 0; i < mod; i++) {
            sec[i] = nums[nums.length-mod+i];
        }
        for (int i = nums.length - mod -1; i >= 0 ; i--) {
            nums[i+mod] = nums[i];
        }
        for (int i = 0; i < mod; i++) {
            nums[i] = sec[i];
        }
        System.out.println("mod = " + mod);
        Arrays.stream(sec).forEach(System.out::print);
        System.out.println();
        Arrays.stream(nums).forEach(System.out::print);
        System.out.println();
    }
    public static void rotate(int[] nums, int k) {
        //Beats 8.8% in TC and 50% in SC
        int mod = k % nums.length;
        // 1. Reverse the entire array
        // 2. Reverse first k elements
        // 3. Reverse last n-k elements
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
        for (int i = 0; i < mod/2; i++) {
            int temp = nums[i];
            nums[i] = nums[mod-i-1];
            nums[mod-i-1] = temp;
        }
        for (int i = mod; i < (nums.length + mod)/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-i+mod-1];
            nums[nums.length-i+mod-1] = temp;
        }
        System.out.println("mod = " + mod);
        Arrays.stream(nums).forEach(System.out::print);
        System.out.println();
    }
}
