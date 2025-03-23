import easy.CanPlaceFlowers;
import easy.MajorityElement;
import easy.RemoveDuplicatesfromSortedArrayII;
import easy.RotateArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,4,5,6,7};
        RotateArray.rotate(test1, 3);
        int[] test2 = new int[]{-1,-100,3,99};
        RotateArray.rotate(test2, 2);
        int[] test3 = new int[]{0,1,0};
        RotateArray.rotate(test3, 1);
        int[] test4 = new int[]{0};
        RotateArray.rotate(test4, 1);
        int[] test5 = new int[]{1};
        RotateArray.rotate(test5, 0);
        int[] test6 = new int[]{0,0,0,0};
        RotateArray.rotate(test6, 10);
    }
}