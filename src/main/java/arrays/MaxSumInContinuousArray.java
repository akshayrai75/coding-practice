package arrays;

public class MaxSumInContinuousArray {
    static public double getMaxSum (double[] givenArr) {
        if(givenArr.length > 0) {
            double max_till_now = givenArr[0];
            double current_max = givenArr[0];
            for(double num: givenArr) {
                current_max = max(num, num + current_max);
                max_till_now = max(max_till_now, current_max);
            }
            return max_till_now;
        } else return 0;
    }

    private static double max(double firstNum, double secondNum) {
        return firstNum > secondNum ? firstNum : secondNum;
    }
}
