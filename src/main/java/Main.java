import arrays.MinMaxFromArray;
import arrays.ReverseTheArray;

import java.util.Arrays;

public class Main {
    private static void reverseTheArrayTest (){
        System.out.println("Reverse The Array:");
        String[] strArr = {"First ", "Second ", "Third ", "Fourth ", "Last "};
        Arrays.stream(strArr).forEach(System.out::print);
        System.out.println("-> ");
        Arrays.stream(ReverseTheArray.reverse(strArr)).forEach(System.out::print);
        System.out.println("\n!uoy evol I -> "+ReverseTheArray.reverse("!uoy evol I"));
        System.out.println("------------------------------------------------");

        System.out.println("\nMinimum and maximum from the array");
        Number[] numArr = {1.2, 1.5, 2.25, 1.09, 3};
        MinMaxFromArray minMaxPair = new MinMaxFromArray(numArr);
        Arrays.stream(numArr).forEach(num -> System.out.print(num + ", "));
        System.out.println("-> ");
        System.out.println("Minimum: "+ minMaxPair.getMinimum() + " & Maximum: "+ minMaxPair.getMaximum());
        System.out.println("------------------------------------------------");

    }

    public static void main(String[] args) {
        reverseTheArrayTest();
    }
}
