package arrays;

import java.util.*;

public class SortArrayWithoutSort {
    public static void sort_0_1_2_arrayMethod_1(int[] arrayOf_0_1_2) throws Exception {
        int arrLen = arrayOf_0_1_2.length;
        if (arrLen > 0) {
            int low = 0, mid = 0, high = arrLen - 1;
            for (int i = 0; i <= high; i++) {
                switch (arrayOf_0_1_2[i]) {
                    case 0:
                        swapArrElements(arrayOf_0_1_2, low, mid);
                        mid++;
                        low++;
                        break;
                    case 1:
                        mid++;
                        break;
                    case 2:
                        swapArrElements(arrayOf_0_1_2, mid, high);
                        high--;
                        break;
                    default:
                        throw new Exception("Sorting aborted midway as unknown value occurred in the array. Allowed values are 0, 1 and 2 only.");
                }
            }
        }
    }

    public static Integer[] sort_0_1_2_arrayMethod_2(Integer[] arrayOf_0_1_2) {
        Map<Integer, Integer> count_of_each_val = new HashMap<>(Map.ofEntries(
                Map.entry(0, 0),
                Map.entry(1, 0),
                Map.entry(2, 0)
        ));
        List<Integer> arrOfUnknowns = new ArrayList<>();
        Integer[] arrOfKnown = {0, 1, 2};
        List<Integer> listOfKnown = Arrays.asList(arrOfKnown);

        for (Integer num : arrayOf_0_1_2) {
            if (listOfKnown.contains(num)) {
                Integer temp_count = count_of_each_val.get(num);
                count_of_each_val.put(num, ++temp_count);
            } else {
                arrOfUnknowns.add(num);
            }
        }

        List<Integer> sortedList = new ArrayList<>();

        count_of_each_val.forEach((key, value) -> {
            for (int i = 0; i < value; i++) sortedList.add(key);
        });
        sortedList.addAll(arrOfUnknowns);

        arrayOf_0_1_2 = Arrays.stream(sortedList.toArray())
                .map(o -> (Integer) o)
                .toArray(Integer[]::new);

        return arrayOf_0_1_2;
    }

    private static void swapArrElements(int arr[], int firstPos, int secondPos) {
        int temp = arr[firstPos];
        arr[firstPos] = arr[secondPos];
        arr[secondPos] = temp;
    }
}
