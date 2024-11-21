package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put('I',1);
        charMap.put('V',5);
        charMap.put('X',10);
        charMap.put('L',50);
        charMap.put('C',100);
        charMap.put('D',500);
        charMap.put('M',1000);

        int ans = 0;

        // following if conditions gives result in 7ms which is beating only 12%
        /*for (int i = s.length() - 1; i>=0; i--){
            if(i==0)  ans += charMap.get(s.charAt(i));
            else {
                ans += charMap.get(s.charAt(i));
                if ((s.charAt(i) == 'V' || s.charAt(i) == 'X') && s.charAt(i-1) == 'I') {
                    ans -= 1;
                    i -= 1;
                }
                if ((s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i-1) == 'X') {
                    ans -= 10;
                    i -= 1;
                }
                if ((s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i-1) == 'C') {
                    ans -= 100;
                    i -= 1;
                }
            }
        }*/

        // following rearranged if conditions gives result in 4ms which is beating only 73%
        for (int i = s.length() - 1; i>=0; i--) {
            char currChar = s.charAt(i);

            if(i==0)  ans += charMap.get(currChar);
            else {
                char precedingChar = s.charAt(i-1);
                ans += charMap.get(currChar);
                if (precedingChar == 'I' && (currChar == 'V' || currChar == 'X')) {
                    ans -= 1;
                    i -= 1;
                }
                if (precedingChar == 'X' && (currChar == 'L' || currChar == 'C')) {
                    ans -= 10;
                    i -= 1;
                }
                if (precedingChar == 'C' && (currChar == 'D' || currChar == 'M')) {
                    ans -= 100;
                    i -= 1;
                }
            }
        }

        return ans;
    }
}
