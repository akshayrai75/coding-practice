package easy;

public class AddBinary {
    /**
     * Given two binary strings a and b, return their sum as a binary string.<br>
     * @Example-1:
     * Input: a = "11", b = "1" <br>
     * Output: "100"<br>
     * @Example-2:
     * Input: a = "1010", b = "1011"<br>
     * Output: "10101"<br>
     * @Constraints:
     * 1 <= a.length, b.length <= 104<br>
     * a and b consist only of '0' or '1' characters.<br>
     * Each string does not contain leading zeros except for the zero itself.
     * */
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int aLen = a.length();
        int bLen = b.length();
        int smallLen = Math.min(aLen, bLen);
//        int largeLen = Math.max(aLen, bLen);
        for (int i = 0; i < smallLen; i++) {
            boolean condition1 = a.charAt(aLen - i - 1) == '0' && b.charAt(bLen - i - 1) == '0';
            boolean condition2 = a.charAt(aLen - i - 1) == '0' && b.charAt(bLen - i - 1) == '1'
                    || a.charAt(aLen - i - 1) == '1' && b.charAt(bLen - i - 1) == '0';
            boolean condition3 = a.charAt(aLen - i - 1) == '1' && b.charAt(bLen - i - 1) == '1';
            if (carry == 0) {
                if (condition1) ans.append("0");
                if (condition2) ans.append("1");
                if (condition3) {
                    ans.append("0");
                    carry = 1;
                }
            } else {
                if (condition1) {
                    ans.append("1");
                    carry = 0;
                }
                if (condition2) {
                    ans.append("0");
                }
                if (condition3) {
                    ans.append("1");
                }
            }
        }
        String c = aLen > bLen ? a : b;
        for (int i = c.length() - smallLen - 1; i >= 0; i--) {
            if(c.charAt(i) == '1' && carry == 1 || c.charAt(i) == '0' && carry == 0) {
                ans.append("0");
            } else {
                ans.append("1");
                carry = 0;
            }
        }
        if (carry == 1) ans.append("1");

        return ans.reverse().toString();
    }
}
