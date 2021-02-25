package Int_JavaChallanges_2;

import java.util.*;

public class P10_FindSecondLargestElementInArray {
    public static void main(String[] args) {

        int[] arr = {3, 1, 3, 4, 65, 67, 8, 9, 0, 3, 1, 89};
        secondLargest(arr);
    }

    static void secondLargest(int[] arr){

        Set<Integer> integerSet= new TreeSet<>();

        for (int element:arr) {
            integerSet.add(element);
            }

        Integer[] result= integerSet.toArray(new Integer[integerSet.size()]);
        System.out.println( result[result.length-2]);
    }
}

