import arrays.*;

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
            SortArrayWithoutSort.sort_0_1_2_arrayMethod_1(givenArr);
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
            SortArrayWithoutSort.sort_0_1_2_arrayMethod_1(givenArr);
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
            SortArrayWithoutSort.sort_0_1_2_arrayMethod_1(givenArr);
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
            SortArrayWithoutSort.sort_0_1_2_arrayMethod_1(givenArr);
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
            SortArrayWithoutSort.sort_0_1_2_arrayMethod_1(givenArr);
        } catch (Exception e) {
            System.out.println("\n"+e.getMessage());
        }
        System.out.print("Sorted: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        System.out.println("");
        System.out.print("Given Array for method 2-> ");
        Integer [] givenArr2= {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1, 2};;
        Arrays.stream(givenArr2).forEach(num -> System.out.print(num + ", "));
        givenArr2 = SortArrayWithoutSort.sort_0_1_2_arrayMethod_2(givenArr2);
        System.out.print("\nSorted: ");
        Arrays.stream(givenArr2).forEach(num -> System.out.print(num + ", "));

        System.out.println("");
        System.out.print("Given Array with unknowns for method 2-> ");
        givenArr2= new Integer[]{0, 1, 1, 0, 10, 2, 4, 1, 2, 0, 0, 5, 0, 1};
        Arrays.stream(givenArr2).forEach(num -> System.out.print(num + ", "));
        givenArr2 = SortArrayWithoutSort.sort_0_1_2_arrayMethod_2(givenArr2);
        System.out.print("\nSorted: ");
        Arrays.stream(givenArr2).forEach(num -> System.out.print(num + ", "));
        System.out.println("\n------------------------------------------------");
    }

    private static void separateNegativeAndPositive() {
        System.out.println("\nSeparate -ve & +ve in the array");
        double[] givenArr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        System.out.print("Give arr: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("-> ");

        SeparatePositiveNegative.separate(givenArr);
        System.out.print("Rearranged arr: ");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));

        givenArr = new double[]{};
        System.out.print("\nEmpty arr: ->");
        Arrays.stream(givenArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("\n------------------------------------------------");
    }

    private static void unionAndIntersectionOfArrays() {
        System.out.println("\nUnion And Intersection Of Arrays");
        Integer[] givenArr_1 = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        Integer[] givenArr_2 = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        System.out.print("Give arrays: ");
        Arrays.stream(givenArr_1).forEach(num -> System.out.print(num + ", "));
        System.out.println("");
        Arrays.stream(givenArr_2).forEach(num -> System.out.print(num + ", "));
        System.out.println("\n-> ");

        FindUnionAndIntersection findUnionAndIntersection = new FindUnionAndIntersection(givenArr_1, givenArr_2);
        System.out.print("Union arr: ");
        Arrays.stream(findUnionAndIntersection.getUnionOfArray()).forEach(num -> System.out.print(num + ", "));
        System.out.print("\nIntersection arr: ");
        Arrays.stream(findUnionAndIntersection.getIntersectionOfArray()).forEach(num -> System.out.print(num + ", "));


        givenArr_1 = new Integer[] {1, 3, 4, 5, 7};
        givenArr_2 = new Integer[] {2, 3, 5, 6};
        System.out.print("\nGive arrays: ");
        Arrays.stream(givenArr_1).forEach(num -> System.out.print(num + ", "));
        System.out.println("");
        Arrays.stream(givenArr_2).forEach(num -> System.out.print(num + ", "));
        System.out.println("\n-> ");

        findUnionAndIntersection = new FindUnionAndIntersection(givenArr_1, givenArr_2);
        System.out.print("Union arr: ");
        Arrays.stream(findUnionAndIntersection.getUnionOfArray()).forEach(num -> System.out.print(num + ", "));
        System.out.print("\nIntersection arr: ");
        Arrays.stream(findUnionAndIntersection.getIntersectionOfArray()).forEach(num -> System.out.print(num + ", "));

        findUnionAndIntersection = new FindUnionAndIntersection();
        System.out.print("\n\nEmpty Union arr: -> ");
        Arrays.stream(findUnionAndIntersection.getUnionOfArray()).forEach(num -> System.out.print(num + ", "));
        System.out.print("\nEmpty Intersection arr: -> ");
        Arrays.stream(findUnionAndIntersection.getIntersectionOfArray()).forEach(num -> System.out.print(num + ", "));
        System.out.println("\n------------------------------------------------");
    }

    private static void cyclicRotateByOneOfArr () {
        System.out.println("\nCyclic rotate by one of an array");
        Number[] numArr = {9, 8, 7, 6, 4, 2, 1, 3};
        System.out.println("Given Arr: ");
        Arrays.stream(numArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("-> ");
        System.out.println("\nOutput: ");
        CyclicRotateByOne.rotate(numArr);
        Arrays.stream(numArr).forEach(num -> System.out.print(num + ", "));


        String[]strArr = {"One", "Two", "Three", "Last"};
        System.out.println("\n\nGiven Str Arr: ");
        Arrays.stream(strArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("-> ");
        System.out.println("\nOutput: ");
        CyclicRotateByOne.rotate(strArr);
        Arrays.stream(strArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("");
        System.out.println("------------------------------------------------");
    }

    private static void maxSumInContiArr () {
        double givenArr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Arrays.stream(givenArr).forEach(num -> System.out.println(num + ", "));
        System.out.println("\nMaximum contiguous sum is: "
                + MaxSumInContinuousArray.getMaxSum(givenArr));
        System.out.println("\nMaximum contiguous sum in Empty Arr is: "
                + MaxSumInContinuousArray.getMaxSum(new double[]{}));
        System.out.println("");
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        reverseTheArrayTest();
        minMaxFromAnArr();
        k_th_minMaxFromAnArr();
        sort_0s_1s_2s_arr();
        separateNegativeAndPositive();
        unionAndIntersectionOfArrays();
        cyclicRotateByOneOfArr();
        maxSumInContiArr();
    }
}
