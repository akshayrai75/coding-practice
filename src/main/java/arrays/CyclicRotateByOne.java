package arrays;

public class CyclicRotateByOne {
    public static void rotate(Object[] inputArr) {
        int arrLen = inputArr.length;
        if (arrLen > 0) {
            Object lastElement = inputArr[arrLen - 1];

            for (int i = arrLen - 1; i >= 0; i--) {
                if (i == 0) inputArr[i] = lastElement;
                else inputArr[i] = inputArr[i - 1];
            }
        }
    }
}
