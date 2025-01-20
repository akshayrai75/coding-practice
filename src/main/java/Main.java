import easy.MergeSortedArray;

public class Main {
    public static void main(String[] args) {
        int[] test1Num1 = new int[]{1,2,3,0,0,0};
        int[] test1Num2 = new int[]{2,5,6};
        MergeSortedArray.merge(test1Num1, 3, test1Num2, 3);
        for (int i : test1Num1) System.out.print(i + " ");
        System.out.println();

        int[] test2Num1 = new int[]{1};
        int[] test2Num2 = new int[0];
        MergeSortedArray.merge(test2Num1, 1, test2Num2, 0);
        for (int i : test2Num1) System.out.print(i + " ");
        System.out.println();

        int[] test3Num1 = new int[]{0};
        int[] test3Num2 = new int[]{1};
        MergeSortedArray.merge(test3Num1, 0, test3Num2, 1);
        for (int i : test3Num1) System.out.print(i + " ");
        System.out.println();

        int[] test4Num1 = new int[]{2,0};
        int[] test4Num2 = new int[]{1};
        MergeSortedArray.merge(test4Num1, 1, test4Num2, 1);
        for (int i : test4Num1) System.out.print(i + " ");
        System.out.println();

        int[] test5Num1 = new int[]{4, 0, 0, 0, 0, 0};
        int[] test5Num2 = new int[]{1,2,3,5,6};
        MergeSortedArray.merge(test5Num1, 1, test5Num2, 5);
        for (int i : test5Num1) System.out.print(i + " ");
    }
}