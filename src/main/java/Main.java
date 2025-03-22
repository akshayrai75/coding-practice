import easy.MajorityElement;
import easy.RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,1,1,2,2,3};
        int ans1= MajorityElement.majorityElementMooreVoteAlgo(test1);
        int[] test2 = new int[]{0,0,1,1,1,1,2,3,3};
        int ans2=MajorityElement.majorityElementMooreVoteAlgo(test2);
        int[] test3 = new int[]{1,1,1,1,1,1,1,1,1};
        int ans3=MajorityElement.majorityElementMooreVoteAlgo(test3);
        int[] test4 = new int[]{1,2,3,4,5};
        int ans4=MajorityElement.majorityElementMooreVoteAlgo(test4);
        int[] test5 = new int[]{3,2,3};
        int ans5= MajorityElement.majorityElementMooreVoteAlgo(test5);
        int[] test6 = new int[]{2,2,1,1,1,2,2};
        int ans6=MajorityElement.majorityElementMooreVoteAlgo(test6);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        System.out.println(ans6);
    }
}