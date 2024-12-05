package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    /**
     Problem:
     Write a function to find the longest common prefix string amongst an array of strings.
     If there is no common prefix, return an empty string "".<br>
        @Example-1:
        Input: strs = ["flower","flow","flight"]<br>
        Output: "fl"<br>

        @Example-2:
        Input: strs = ["dog","racecar","car"]<br>
        Output: ""<br>
        Explanation: There is no common prefix amongst the input strings.
     */
    public static String longestCommonPrefix(String[] strs) {

        /*
        // Below takes 3ms and only beats 17.5%
        char[] prefixes = new char[0];
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if (i == 0) {
                prefixes = str.toCharArray();
            } else {
                char[] tempStr = str.toCharArray();
                int loopLen = Math.min(prefixes.length, tempStr.length);
                char[] temp = new char[loopLen];

                for (int j = 0; j < loopLen; j++) {
                    if (prefixes[j] == tempStr[j])
                        temp[j] = prefixes[j];
                    else break;
                }
                prefixes = temp;
            }
        }
        String ans = new String(prefixes);
        return ans.replaceAll("\\u0000", "");
        */

        // Below takes 2ms and only beats 21.6%
        /*
        String prefix = strs[0];
        if (strs.length == 1) return prefix;
        else {
            for (int i = 0; i < strs.length; i++) {
                int minStrLen = Math.min(prefix.length(), strs[i].length());
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < minStrLen; j++) {
                    if (prefix.charAt(j) == strs[i].charAt(j)) temp.append(prefix.charAt(j));
                    else break;
                }
                prefix = temp.toString();
            }
        }
        return prefix;
        */

        // Below takes 1ms and only beats 65.6% as time complexity now is O(m log n)
        StringBuilder temp = new StringBuilder();
        Arrays.sort(strs);
        String fStr = strs[0];
        String lStr = strs[strs.length - 1];
        for (int i = 0; i < Math.min(fStr.length(), lStr.length()); i++) {
            if (fStr.charAt(i) != lStr.charAt(i)) return temp.toString();
            temp.append(fStr.charAt(i));
        }
        return temp.toString();
    }
}
