import easy.RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,1,1,2,2,3};
        int ans1= RemoveDuplicatesfromSortedArrayII.removeDuplicates(test1);
        int[] test2 = new int[]{0,0,1,1,1,1,2,3,3};
        int ans2=RemoveDuplicatesfromSortedArrayII.removeDuplicates(test2);
        int[] test3 = new int[]{1,1,1,1,1,1,1,1,1};
        int ans3=RemoveDuplicatesfromSortedArrayII.removeDuplicates(test3);
        int[] test4 = new int[]{1,2,3,4,5};
        int ans4=RemoveDuplicatesfromSortedArrayII.removeDuplicates(test4);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);

        Arrays.stream(test1).forEach(ints -> System.out.print(ints + ", "));
        System.out.println();
        Arrays.stream(test2).forEach(ints -> System.out.print(ints + ", "));
        System.out.println();
        Arrays.stream(test3).forEach(ints -> System.out.print(ints + ", "));
        System.out.println();
        Arrays.stream(test4).forEach(ints -> System.out.print(ints + ", "));
    }
}