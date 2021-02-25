package Int_JavaChallanges_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class P19_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};


        intersectionOfTwoArrays(s1,s2);
    }

    static void intersectionOfTwoArrays(String[] s1, String[] s2){
        HashSet<String> set= new HashSet<>();
        ArrayList<String> list_s2= new ArrayList(Arrays.asList(s2));
        for (String el:s1 ) {
            while(list_s2.contains(el)){
                set.add(el);
                list_s2.remove(el);
            }
        }

        for (String el:set  ) {
            System.out.print(el+" ");
        }

    }
}
