import arrays.ReverseTheArray;

import java.util.Arrays;

public class Main {
    private static void reverseTheArrayTest (){
        String[] strArr = {"First", "Second", "Third", "Fourth", "Last"};
        Arrays.stream(ReverseTheArray.reverse(strArr)).forEach(System.out::println);
        System.out.println(ReverseTheArray.reverse("!uoy evol I"));
    }

    public static void main(String[] args) {
        reverseTheArrayTest();
    }
}
