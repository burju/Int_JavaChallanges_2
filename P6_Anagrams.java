package Int_JavaChallanges_2;

import java.util.Arrays;

/**
 * Write a java program to check whether two given strings are anagram or not.
 * Two strings are said to be anagram if they contain same set of characters but in different order.
 * For example, “Mother In Law” and “Hitler Woman” are anagrams
 */
public class P6_Anagrams {

    public static void main(String[] args) {
        String s1= "Mother In Law";
                String s2="Hitler Woman";

        System.out.println(areAnagrams(s1,s2));
    }

    static boolean areAnagrams(String s1, String s2){
        while(s1.contains(" ")){
           s1= s1.replace(" ", "");
        }

        while(s2.contains(" ")){
            s2= s2.replace(" ", "");
        }

        char[] charArr1= s1.toLowerCase().toCharArray();
         char[] charArr2= s1.toLowerCase().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if( charArr1.length!=charArr2.length){
            return false;
        }
        else{

            return Arrays.equals(charArr1,charArr2);
        }
    }
}
