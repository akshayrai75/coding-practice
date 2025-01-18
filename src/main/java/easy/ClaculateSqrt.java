package easy;

public class ClaculateSqrt {
    /**
     * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
     * You must not use any built-in exponent function or operator.<br>
     * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.<br>
     * @Example-1: Input: x = 4<br>
     * Output: 2<br>
     * Explanation: The square root of 4 is 2, so we return 2.<br>
     * @Example-2: Input: x = 8<br>
     * Output: 2<br>
     * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer,
     * 2 is returned.<br>
     * @Constraints: 0 <= x <= 231 - 1
     * */
    // A simple way to solve the problem
    // beats 9.6% with 19ms
    public static int mySqrtSimple(int x) {
        if (x<=1) return x;
        long ans = 1;
        while (ans * ans <= x) {
            ans++;
        }
        return (int) (ans-1);
    }

    // using partial binary method
    // beats 11.2% with 7ms
    public static int mySqrtPartialBinary(int x) {
        if(x <= 1) return x;

        long ans = x / 2;

        while (ans * ans > x) ans /= 2;

        while (ans * ans <= x) ans++;

        return (int) ans-1;
    }

    // using binary method
    // beats 11.2% with 7ms
    public static int mySqrtBinary(int x) {
        if(x <= 1) return x;

        long ans = x / 2;

        while (ans * ans > x) ans /= 2;

        long prevMid = ans * 2;

        while (ans * ans <= x) ans++;

        return (int) ans-1;
    }

    // using binary search
    // beats 87%
    public static int mySqrtBinarySearch(int x){
        if (x < 2) return x;
        int start = 0;
        int end = x;
        int mid = 1;
        while (start<=end) {
            mid = start + (end - start)/2;
            if ((long)mid*mid > (long)x) end=mid-1;
            else if ((long)mid * mid < (long)x) start=mid+1;
            else return mid;
        }
        return end;
    }
}
