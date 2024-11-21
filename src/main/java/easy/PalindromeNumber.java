package easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if ( x < 10 && x >= 0) return true;
        if (x < 0 || x%10 == 0) return false;
        int temp = x;
        int count = x;
        long lastPos = 1;
        long altN = 0;

        while (count > 0) {
            lastPos *= 10;
            count /= 10;
        }
        lastPos /= 10;

        while(lastPos > 0) {
            altN += temp%10 * lastPos;
            temp /= 10;
            lastPos /= 10;
        }
        System.out.println(x);
        System.out.println(altN);
        return x == altN;
    }
}
