package easy;

public class PlusOne {
    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
     * the integer. The digits are ordered from most significant to least significant in left-to-right order. The large
     * integer does not contain any leading 0's. <br>
     * Increment the large integer by one and return the resulting array of digits. <br> <br>
     * @Example 1:
     * Input: digits = [1,2,3] <br>
     * Output: [1,2,4] <br>
     * Explanation: The array represents the integer 123. <br>
     * Incrementing by one gives 123 + 1 = 124. <br>
     * Thus, the result should be [1,2,4]. <br> <br>
     * @Example 2:
     * Input: digits = [4,3,2,1] <br>
     * Output: [4,3,2,2] <br>
     * Explanation: The array represents the integer 4321. <br>
     * Incrementing by one gives 4321 + 1 = 4322. <br>
     * Thus, the result should be [4,3,2,2]. <br> <br>
     * @Example 3:
     * Input: digits = [9] <br>
     * Output: [1,0] <br>
     * Explanation: The array represents the integer 9. <br>
     * Incrementing by one gives 9 + 1 = 10. <br>
     * Thus, the result should be [1,0]. <br> <br>
     * @Constraints:
     * 1 <= digits.length <= 100 <br>
     * 0 <= digits[i] <= 9 <br>
     * digits does not contain any leading 0's.
     * */
    public static int[] plusOne(int[] digits) {
        int lenOfArr = digits.length;
        int carry = 0;
        for (int i = lenOfArr-1; i >= 0; i--) {
            int currDig = 0;
            if ( i == lenOfArr-1) {
                currDig = digits[i] + 1;
            } else {
                currDig = digits[i] + carry;
                carry = 0;
            }
            if (currDig == 10) {
                carry = 1;
                currDig = 0;
            }
            digits[i] = currDig;
        }
        int[] ans;
        if (carry == 1) {
            ans = new int[digits.length + 1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, digits.length);
        } else {
            ans = digits;
        }
        return ans;
    }
}
