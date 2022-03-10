package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindUnionAndIntersection {
    private List<Integer> unionList = new ArrayList<>();
    private List<Integer> intersectionList = new ArrayList<>();
    
    public FindUnionAndIntersection() {
    }

    public FindUnionAndIntersection(Integer[] givenArr_1, Integer[] givenArr_2) {
        getUnionAndIntersection(givenArr_1, givenArr_2);
    }
    
    private void getUnionAndIntersection(Integer[] givenArr_1, Integer[] givenArr_2) {
        int lengthOfArr_1 = givenArr_1.length;
        int lengthOfArr_2 = givenArr_2.length;
        int ptrTo_1 = 0;
        int ptrTo_2 = 0;
        
        for (int i=0; i < lengthOfArr_1+lengthOfArr_2; i++) {
            if (givenArr_1[ptrTo_1].equals(givenArr_2[ptrTo_2])){


                if (ptrTo_1  < lengthOfArr_1 - 1) {
                    unionList.add(givenArr_1[ptrTo_1]);
                    intersectionList.add(givenArr_1[ptrTo_1]);
                    ptrTo_1++;
                }
                if (ptrTo_2  < lengthOfArr_2 - 1) {
                    ptrTo_2++;
                }
                i++;
            }
            if (givenArr_1[ptrTo_1] < givenArr_2[ptrTo_2]) {

                if (ptrTo_1  < lengthOfArr_1 - 1) {
                    unionList.add(givenArr_1[ptrTo_1]);
                    ptrTo_1++;
                }
            }
            if (givenArr_2[ptrTo_2] < givenArr_1[ptrTo_1]) {
                if (ptrTo_2  < lengthOfArr_2 - 1) {
                    unionList.add(givenArr_2[ptrTo_2]);
                    ptrTo_2++;
                }
            }
        }
    }

    public Integer[] getUnionOfArray () {
        return unionList.toArray(Integer[]::new);
    }

    public Integer[] getIntersectionOfArray () {
        return intersectionList.toArray(Integer[]::new);
    }
}
