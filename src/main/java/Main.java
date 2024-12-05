import easy.PlusOne;

public class Main {
    public static void main(String[] args) {
        int[] test1 = PlusOne.plusOne(new int[]{1,2,3});
        for (int i: test1) System.out.print(i);
        System.out.println();
        int[] test2 = PlusOne.plusOne(new int[]{4,3,2,1});
        for (int i: test2) System.out.print(i);
        System.out.println();
        int[] test3 = PlusOne.plusOne(new int[]{9});
        for (int i: test3) System.out.print(i);
        System.out.println();
        int[] test4 = PlusOne.plusOne(new int[]{0});
        for (int i: test4) System.out.print(i);
        System.out.println();
        int[] test5 = PlusOne.plusOne(new int[]{9,9,9,9});
        for (int i: test5) System.out.print(i);
        System.out.println();
    }
}