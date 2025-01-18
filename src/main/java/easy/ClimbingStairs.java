package easy;

public class ClimbingStairs {
    /**
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *<br>
     * @Example-1:
     * Input: n = 2 <br>
     * Output: 2<br>
     * Explanation: There are two ways to climb to the top.<br>
     * 1. 1 step + 1 step<br>
     * 2. 2 steps<br><br>
     * @Example-2:
     * Input: n = 3<br>
     * Output: 3<br>
     * Explanation: There are three ways to climb to the top.<br>
     * 1. 1 step + 1 step + 1 step<br>
     * 2. 1 step + 2 steps<br>
     * 3. 2 steps + 1 step<br>
     * */
    public static int climbStairs(int n) {
        //Using Fibonacci series
        if (n < 2) return n;
        return getFibonacci2(n);
    }

    // The below recursive method takes about 41 MB beating only 37% in memory (Space complexity)
    // Below does beat 100% in Time complexity
    private static int getFibonacci(int n, int prev1, int prev2) {
        int nxt = prev1 + prev2;
        if (n==0) return nxt;
        return getFibonacci(n-1, prev2, nxt);
    }

    // The below looping method takes 40.3 MB beating only 63% in memory (Space complexity)
    // Below does beat 100% in Time complexity
    private static int getFibonacci2(int n) {
        int prev1 = 0, prev2 = 1;
        for (int i = 0; i < n; i++) {
            int temp = prev2;
            prev2 += prev1;
            prev1 = temp;
        }
        return prev2;
    }
}
