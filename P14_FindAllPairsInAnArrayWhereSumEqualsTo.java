package Int_JavaChallanges_2;

import java.util.ArrayList;
import java.util.List;

/**
 * How to find all pairs of elements in an array whose sum is equal to given number?
 *
 * Write a java program to find all pairs of elements in the given array whose sum is equal to a given number.
 * For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
 * then you have to find all pairs of elements in this array whose sum must be 20.
 * In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20
 */
public class P14_FindAllPairsInAnArrayWhereSumEqualsTo {
    public static void main(String[] args) {
        int[] arr= {4, 5, 7, 11, 9, 13, 8, 12};
        int total=20;

        findPairs(arr, total);
    }

    static void findPairs(int[] arr, int total){
        List<Integer> list= new ArrayList<>();

        for (int element: arr   ) {
            list.add(element);
        }


        for (int i = 0; i <list.size() ; i++) {
            for (int j = 1; j < list.size() ; j++) {
                if(list.get(i)+ list.get(j)==total){
                    System.out.println("("+list.get(i) +","+list.get(j)+")");
                    list.remove(i);

                }
            }
        }
    }
}
