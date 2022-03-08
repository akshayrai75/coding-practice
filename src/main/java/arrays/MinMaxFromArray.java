package arrays;

public class MinMaxFromArray {
    private Number minimum;
    private Number maximum;

    public MinMaxFromArray() {
    }

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

    public Number getMinimum() {
        return minimum;
    }

    public Number getMaximum() {
        return maximum;
    }
}
