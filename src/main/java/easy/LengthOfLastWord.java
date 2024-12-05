package easy;

public class LengthOfLastWord {
    /**
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only. <br><br>
     *
     * @Example-1:
     * Input: s = "Hello World" <br>
     * Output: 5 <br>
     * Explanation: The last word is "World" with length 5. <br><br>
     * @Example-2:
     * Input: s = "   fly me   to   the moon  " <br>
     * Output: 4 <br>
     * Explanation: The last word is "moon" with length 4. <br><br>
     * @Example-3:
     * Input: s = "luffy is still joyboy" <br>
     * Output: 6 <br>
     * Explanation: The last word is "joyboy" with length 6. <br><br>
     * @Constraints:
     * 1 <= s.length <= 104 <br>
     * s consists of only English letters and spaces ' '. <br>
     * There will be at least one word in s.
     * */
    public static int lengthOfLastWord(String s) {
        // Following is using inbuilt functions and beats 100% taking 0ms and beats around 8% memory consumption wise.
        /*
        String[] strArr = s.trim().split(" ");
        return strArr[strArr.length -1].length();
        */

        // *************************************************************
        // Following is without using inbuilt function, beats 100% and beats 24.6% memory consumption wise too.
        int cnt = 0;
        boolean word = false;
        for (int i = s.length() -1; i >= 0; i--) {
            if (!word && s.charAt(i) != ' ') word = true;
            if (word && s.charAt(i) != ' ') cnt++;
            if (word && s.charAt(i) == ' ') break;
        }
        return cnt;
    }
}
