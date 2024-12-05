package easy;

import java.util.Stack;

public class ValidateParentheses {
    /**
     * Problem:<br>
     Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
     is valid.<br>
     An input string is valid if:<br>
     1. Open brackets must be closed by the same type of brackets.<br>
     2. Open brackets must be closed in the correct order.<br>
     3. Every close bracket has a corresponding open bracket of the same type.<br>
     @Example 1:
     Input: s = "()"<br>
     Output: true<br>
     @Example 2:
     Input: s = "()[]{}"<br>
     Output: true<br>
     @Example 3:
     Input: s = "(]"<br>
     Output: false<br>
     @Example 4:
     Input: s = "([])"<br>
     Output: true<br>
     * */
    public static boolean isValid(String s) {
        // Runtime is 3ms and beats 42.9%
        /*
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (parentheses.empty()) return false;
                if (parentheses.peek() != '(') return false;
                else parentheses.pop();
            } else if (s.charAt(i) == '}') {
                if (parentheses.empty()) return false;
                if (parentheses.peek() != '{') return false;
                else parentheses.pop();
            } else if (s.charAt(i) == ']') {
                if (parentheses.empty()) return false;
                if (parentheses.peek() != '[') return false;
                else parentheses.pop();
            } else parentheses.push(s.charAt(i));
        }
        if (parentheses.empty()) return true;
        else return false;
        */

        // Runtime is 3ms and beats 42.9%
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char paren = s.charAt(i);
            if (paren == '(' || paren == '{' || paren == '[') parentheses.push(paren);
            else {
                if (parentheses.empty()) return false;
                char top = parentheses.pop();
                if ((paren == ')' && top != '(') ||
                        (paren == '}' && top != '{') ||
                        (paren == ']' && top != '['))
                    return false;
            }
        }
        return parentheses.empty();
    }
}
