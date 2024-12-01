import easy.FirstIndexOfStr;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstIndexOfStr.strStr("sadbutsad", "sad"));
        System.out.println(FirstIndexOfStr.strStr("leetcode", "leeto"));
        System.out.println(FirstIndexOfStr.customFirstIndexOf("sadbutsad", "sad"));
        System.out.println(FirstIndexOfStr.customFirstIndexOf("leetcode", "leeto"));
        System.out.println(FirstIndexOfStr.customFirstIndexOf("a", "a"));
        System.out.println(FirstIndexOfStr.customFirstIndexOf("mississippi", "sipp"));
    }
}