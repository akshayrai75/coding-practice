package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseTheArray {
    public static String reverse(String givenString){
        String[] str2Arr = givenString.split("");
        String[] strArray = (String[]) getReversed(str2Arr);
        StringBuilder stringBuilder = new StringBuilder();

        for (String str: strArray) {
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }

    public static Object[] reverse(Object[] givenArray){
        return getReversed(givenArray);
    }

    public static List<Object> reverse(ArrayList<Object> givenList){
        return Arrays.asList(getReversed(givenList.toArray()));
    }

    private static Object[] getReversed (Object[] givenArray) {
        int arrayLength = givenArray.length;
        if(arrayLength > 1)
        for(int i=0; i < arrayLength / 2 ; i++ ){
            Object tempData = givenArray[i];
            givenArray[i] = givenArray[arrayLength - i - 1];
            givenArray[arrayLength - i - 1] = tempData;
        }
        return givenArray;
    }
}
