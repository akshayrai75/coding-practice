package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxFromArray {
    private Number minimum;
    private Number maximum;

    /**
    * Default minimum and maximum values will be null
    */
    public MinMaxFromArray() {
    }

    /**
    * Will find minimum and maximum from a non-empty array when passed to this class
    */
    public MinMaxFromArray(Number[] numberArray) {
        if(numberArray.length > 0) {
            minimum = numberArray[0];
            maximum = numberArray[0];

            for (Number number : numberArray) {
                if (number.doubleValue() > maximum.doubleValue()) maximum = number;
                if (number.doubleValue() < minimum.doubleValue()) minimum = number;
            }
        }
    }

    /**
     * Will find k-th minimum and maximum from a non-empty array when passed to this class
     */
    public MinMaxFromArray(Number[] numberArray, int k_th_Term) throws Exception {
        int arrLength = numberArray.length;

        if(k_th_Term > arrLength) throw new Exception("Kth Term is greater than the size of the array.");
        if(k_th_Term < 1) throw new Exception("The of Kth Term is invalid.");

        if(arrLength > 0) {
            Arrays.sort(numberArray);

            minimum = numberArray[k_th_Term - 1];
            maximum = numberArray[arrLength - k_th_Term];

        }
    }

    /**
     * Get the minimum number from the array passed to this Class while initializing.
     * */
    public Number getMinimum() {
        return minimum;
    }

    /**
     * Get the Maximum number from the array passed to this Class while initializing.
     * */
    public Number getMaximum() {
        return maximum;
    }
}
