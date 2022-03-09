import arrays.MinMaxFromArray;
import arrays.ReverseTheArray;
import arrays.SortArrayWithoutSort;

import java.util.Arrays;

public class Main {
    private static void reverseTheArrayTest () {
            System.out.println("Reverse The Array:");
            String[] strArr = {"First ", "Second ", "Third ", "Fourth ", "Last "};
            Arrays.stream(strArr).forEach(System.out::print);
            System.out.println("-> ");
            Arrays.stream(ReverseTheArray.reverse(strArr)).forEach(System.out::print);
            System.out.println("\n!uoy evol I -> " + ReverseTheArray.reverse("!uoy evol I"));
            System.out.println("------------------------------------------------");
        }

    private static void minMaxFromAnArr() {
        System.out.println("\nMinimum and maximum from the array");
        Number[] numArr = {1.2, 1.5, 2.25, 1.09, 3};
        MinMaxFromArray minMaxPair = new MinMaxFromArray(numArr);
        Arrays.stream(numArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("-> ");
        System.out.println("Minimum: " + minMaxPair.getMinimum() + " & Maximum: " + minMaxPair.getMaximum());
        minMaxPair = new MinMaxFromArray();
        System.out.println("Empty Minimum: " + minMaxPair.getMinimum() + " & Empty Maximum: " + minMaxPair.getMaximum());
        System.out.println("------------------------------------------------");
    }

    private static void k_th_minMaxFromAnArr() {
        System.out.println("\nK-th Minimum and maximum from the array");
        Number[] numArr2 = {11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        MinMaxFromArray kth_minMaxPair = null;
        try {
            kth_minMaxPair = new MinMaxFromArray(numArr2, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Arrays.stream(numArr2).forEach(num -> System.out.print(num + ", "));
        System.out.println("-> ");
        System.out.println("Minimum: " + kth_minMaxPair.getMinimum() + " & Maximum: " + kth_minMaxPair.getMaximum());
        System.out.println("Now a validation check with kth term = 0: ");
        try {
            kth_minMaxPair = new MinMaxFromArray(numArr2, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------------------");
    }

    private static void sort_0s_1s_2s_arr() {
        System.out.println("\nSort an Array of 0s, 1s and 2s without using sorting functions.");
//        int[] givenArr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] givenArr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2};
        System.out.print("Given Array -> ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("");
        try {
            SortArrayWithoutSort.sort_0_1_2_array(givenArr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Sorted: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        givenArr = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.print("\nGiven Array -> ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("");
        try {
            SortArrayWithoutSort.sort_0_1_2_array(givenArr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Sorted: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        givenArr = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2};
        System.out.print("\nGiven Array -> ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("");
        try {
            SortArrayWithoutSort.sort_0_1_2_array(givenArr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Sorted: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        System.out.println("");
        System.out.print("Given Empty Array -> ");
        givenArr= new int[]{};
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        try {
            SortArrayWithoutSort.sort_0_1_2_array(givenArr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.print("Sorted: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        System.out.println("");
        System.out.print("Given Array with unknowns-> ");
        givenArr= new int[]{0, 1, 1, 0, 1, 2, 4, 1, 2, 0, 0, 5, 0, 1};
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        try {
            SortArrayWithoutSort.sort_0_1_2_array(givenArr);
        } catch (Exception e) {
            System.out.println("\n"+e.getMessage());
        }
        System.out.print("Sorted: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("\n------------------------------------------------");
    }

    public static void main(String[] args) {
        reverseTheArrayTest();
        minMaxFromAnArr();
        k_th_minMaxFromAnArr();
        sort_0s_1s_2s_arr();
    }
}
