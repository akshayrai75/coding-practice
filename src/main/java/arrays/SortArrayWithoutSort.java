package arrays;

public class SortArrayWithoutSort {
    public static void sort_0_1_2_array(int[] arrayOf_0_1_2) throws Exception {
        int arrLen = arrayOf_0_1_2.length;
        if(arrLen > 0) {
            int low = 0, mid = 0, high = arrLen - 1;
            for (int i = 0; i <= high; i++) {
                switch (arrayOf_0_1_2[i]) {
                    case 0:
                        swapArrElements(arrayOf_0_1_2, low, i);
                        if(mid == low) mid++;
                        low++;
                        break;
                    case 1:
                        swapArrElements(arrayOf_0_1_2, mid, i);
                        mid++;
                        break;
                    case 2:
                        swapArrElements(arrayOf_0_1_2, i, high);
                        high--;
                        if(arrayOf_0_1_2[i] == 0) {
                            swapArrElements(arrayOf_0_1_2, low, i);
                            if(mid == low) mid++;
                            low++;
                        }
                        if(arrayOf_0_1_2[i] == 1) {
                            swapArrElements(arrayOf_0_1_2, mid, i);
                            mid++;
                        }
                        if(arrayOf_0_1_2[i] == 2) {
                            swapArrElements(arrayOf_0_1_2, i, high);
                            high--;
                        }
                        break;
                    default:
                        throw new Exception("Sorting aborted midway as unknown value occurred in the array. Allowed values are 0, 1 and 2 only.");
                }
            }
        }
    }

    private static void swapArrElements (int arr[], int firstPos, int secondPos){
        int temp = arr[firstPos];
        arr[firstPos] = arr[secondPos];
        arr[secondPos] = temp;
    }
}
