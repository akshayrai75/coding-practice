import easy.RemoveElemets;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST 1: ");
        int[] nums1 = new int[]{3,2,2,3};
        System.out.println(RemoveElemets.removeElement(nums1, 3));
        for (int j : nums1) {
            System.out.print(j);
        }
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 2: ");
        int[] nums2 = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(RemoveElemets.removeElement(nums2, 2));
        for (int j : nums2) {
            System.out.print(j);
        }
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 3: ");
        int[] nums3 = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveElemets.removeElement(nums3, 1));
        for (int j : nums3) {
            System.out.print(j);
        }
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 4: ");
        int[] nums4 = new int[]{1,1,1,1,1};
        System.out.println(RemoveElemets.removeElement(nums4, 1));
        for (int j : nums4) {
            System.out.print(j);
        }
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("TEST 5: ");
        int[] nums5 = new int[]{2,2,3};
        System.out.println(RemoveElemets.removeElement(nums5, 2));
        for (int j : nums5) {
            System.out.print(j);
        }
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////

    }
}