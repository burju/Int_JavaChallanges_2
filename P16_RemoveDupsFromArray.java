package Int_JavaChallanges_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**How to remove duplicate elements from ArrayList in java?

 Write a java program to remove duplicate elements from already constructed ArrayList.
 This program is one of the collection interview programs in java.
 */

public class P16_RemoveDupsFromArray {
    public static void main(String[] args) {

        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("J2EE");

        listWithDuplicateElements.add("JSP");

        listWithDuplicateElements.add("SERVLETS");

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("STRUTS");

        listWithDuplicateElements.add("JSP");


        removeDups(listWithDuplicateElements);
    }

    static void removeDups(ArrayList<String> list){
        Set<String> resultSet= new HashSet<>();

        for(String el: list){
            resultSet.add(el);
        }
        System.out.println(resultSet);
    }

}
