import easy.RemoveDuplicatesFromSortedArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST 1: ");
        int[] nums1 = new int[]{1,1,2};
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(nums1));
        for (int j : nums1) {
            System.out.print(j);
        }
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 2: ");
        int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(nums2));
        for (int j : nums2) {
            System.out.print(j);
        }
/////////////////////////////////////////////////////////////////////////////////////////////////

    }
}