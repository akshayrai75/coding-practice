package arrays;

public class SeparatePositiveNegative {
    public static void separate(double[] inputArr){
        if (inputArr.length > 0) {
            int ptr = 0;
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] < 0) {
                    if(i != ptr) swap(inputArr, i, ptr);
                    ptr++;
                }
            }
        }
    }

    private static void swap(double[] inputArr, int first, int second) {
        double temp = inputArr[first];
        inputArr[first]= inputArr[second];
        inputArr[second]= temp;
    }
}
