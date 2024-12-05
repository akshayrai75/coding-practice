package easy;

public class FirstIndexOfStr {
    /**
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if
     * needle is not part of haystack.<br>
     * @Example-1:
     * Input: haystack = "sadbutsad", needle = "sad"<br>
     * Output: 0<br>
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.<br>
     * @Example-2:
     * Input: haystack = "leetcode", needle = "leeto"<br>
     * Output: -1<br>
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.<br>
     * @Constraints:
     * 1 <= haystack.length, needle.length <= 104<br>
     * haystack and needle consist of only lowercase English characters.<br>
     * */
    public static int strStr(String haystack, String needle) {
        // Use of inbuilt library and beats 100%
        return haystack.indexOf(needle);
    }

    public static int customFirstIndexOf(String haystack, String needle) {
        // Not using inbuilt library and trying to check manually
        // Beats 100% and memory-wise also beats 52.4%
        if(haystack.length() < needle.length()) return -1;
        int hayLen = haystack.length();
        int neeLen = needle.length();
        for (int i = 0; i < (hayLen - neeLen + 1); i++) {
            if (i+neeLen > hayLen) return -1;
            boolean matched = true;
            if (haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i + neeLen - 1) == needle.charAt(neeLen-1)) {
                for (int j = 0; j < neeLen; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        matched = false;
                        break;
                    }
                }
                if (matched) return i;
            }
        }
        return -1;
    }
}
