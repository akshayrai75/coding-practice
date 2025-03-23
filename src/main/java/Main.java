import easy.CanPlaceFlowers;
import easy.MajorityElement;
import easy.RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,0,0,0,1};
        boolean ans1= CanPlaceFlowers.canPlaceFlowers(test1, 1);
        int[] test2 = new int[]{1,0,0,0,1};
        boolean ans2=CanPlaceFlowers.canPlaceFlowers(test2, 2);
        int[] test3 = new int[]{0,1,0};
        boolean ans3=CanPlaceFlowers.canPlaceFlowers(test3, 1);
        int[] test4 = new int[]{0};
        boolean ans4=CanPlaceFlowers.canPlaceFlowers(test4, 1);
        int[] test5 = new int[]{1};
        boolean ans5=CanPlaceFlowers.canPlaceFlowers(test5, 0);
        int[] test6 = new int[]{0};
        boolean ans6=CanPlaceFlowers.canPlaceFlowers(test6, 0);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        System.out.println(ans6);
    }
}