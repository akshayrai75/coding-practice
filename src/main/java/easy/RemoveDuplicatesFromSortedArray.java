package easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {

        // Beats only 12.6%
        /*List<Integer> ansList = new ArrayList<>();
        ansList.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != ansList.get(ansList.size()-1)) ansList.add(nums[i]);
        }
        for (int i = 0; i < ansList.size(); i++) {
            nums[i] = ansList.get(i);
        }
        return ansList.size();*/

        //POINTERS
        //Beats 100%
        int ptr1 = 0;
        int ptr2 = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[ptr1] == nums[ptr2]) {
                ptr2++;
            } else {
                ptr1++;
                nums[ptr1] = nums[ptr2];
                ptr2++;
            }
        }

        return ptr1 + 1;
    }
}
