package Int_JavaChallanges_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * How to separate zeros from non-zeros in an array?
 *
 * Write a java program to separate zeros from non-zeros in the given array.
 * You have to move zeros either to end of the array or bring them to beginning of the array.
 * For example, if {14, 0, 5, 2, 0, 3, 0} is the given array,
 * then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0}
 * and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.
 */
public class P23_SeperateZerosFromAnArray {
    public static void main(String[] args) {
        int[] arr= {14, 0, 5, 2, 0, 3, 0};
        seperateZeros(arr);
    }

    static void seperateZeros(int[] arr){
        List<Integer> list= new LinkedList();
        for (int el: arr ) {
            list.add(el);
        }

        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)==0){
                result.add(list.get(i));
                list.remove(i);
            }
        }
        result.addAll(list);

        System.out.println(result);

    }
}
