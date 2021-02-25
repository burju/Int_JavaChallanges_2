package Int_JavaChallanges_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Write a java program to count the number of occurrences of each character in a given string.
 * For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each character
 * in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5
 */
public class p12_CountOccurenceOfChars {

    public static void main(String[] args) {
        String str="Java J2EE Java JSP J2EE";

        countOccurance(str);
    }

    static void countOccurance(String str){

        //using a hashmap
        char[] arr= str.toCharArray();


        Map<Character, Integer> resultMap= new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if(resultMap.get(arr[i])==null){
                resultMap.put(arr[i], 1);
            }
            else{
                resultMap.put(arr[i], resultMap.get(arr[i])+1);
            }}

            Set<Map.Entry<Character, Integer>> solnSet= resultMap.entrySet();
            Iterator iterator= solnSet.iterator();

            while(iterator.hasNext()){

                    System.out.print(iterator.next() + ",");
                }
            }
        }



