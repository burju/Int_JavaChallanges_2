package Int_JavaChallanges_2;

import java.util.*;

/**
 * Find the duplicates in an array
 */
public class P8_FindDupsInAnArray_Guzelmis {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,4,6,7,3,1,2,3};
       findDups(arr);
        findDups2(arr);
    }

    //BruteForce Method: going over one by one.

    static void findDups(int[] arr){
        Set<Integer> setSln= new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                setSln.add(arr[i]);
                }
            }
        }

        for (Integer element:setSln) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    //HashMap Method
    static void findDups2(int[] arr){
        Map<Integer, Integer> dupMap= new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            if(dupMap.get(arr[i])==null){
                dupMap.put(arr[i], 1);
            }
            else{
                dupMap.put(arr[i],dupMap.get(arr[i])+1 );
            }

        }

        Set<Map.Entry<Integer, Integer>> mapSet= dupMap.entrySet();
        Iterator iterator= mapSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }
    }
}
