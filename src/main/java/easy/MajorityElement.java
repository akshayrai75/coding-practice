package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * <b>Majority Element</b><br>
     * Given an array nums of size n, return the majority element.<br>
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority
     * element always exists in the array.<br>
     * @Example-1:
     * Input: nums = [3,2,3]<br>
     * Output: 3<br>
     * @Example-2:
     * Input: nums = [2,2,1,1,1,2,2]<br>
     * Output: 2
     * */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int max = 0, ans = 0;
        for (int i: nums) {
            counts.merge(i, 1, Integer::sum);

            if (counts.get(i) > max) {
                max = counts.get(i);
                ans = i;
            }
        }
        return ans;
    }

    /**
     * <b>Moore's Voting Algo</b>
     * Initialize two variables: count and candidate. Set count to 0 and candidate to an arbitrary value.
     * Iterate through the array nums:<br>
     * a. If count is 0, assign the current element as the new candidate and increment count by 1.<br>
     * b. If the current element is the same as the candidate, increment count by 1.<br>
     * c. If the current element is different from the candidate, decrement count by 1.<br>
     * After the iteration, the candidate variable will hold the majority element.<br>
     * */
    public static int majorityElementMooreVoteAlgo(int[] nums) {
        int vote = 0, ans = 0;
        for (int i: nums) {
            if (vote == 0) {
                vote = 1;
                ans = i;
            } else {
                if (i == ans) vote++;
                else vote--;
            }
        }
        return ans;
    }
}
