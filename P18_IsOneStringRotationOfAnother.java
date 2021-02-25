package Int_JavaChallanges_2;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * How to check whether one string is a rotation of another in java?
 *
 * Write a java program to check whether one string is a rotation of another.
 * For example, If “JavaJ2eeStrutsHibernate” is a string then some rotated versions
 * of this string are “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“.
 */
public class P18_IsOneStringRotationOfAnother {

    public static void main(String[] args) {
        String str1= "JavaJ2eeStrutsHibernat2";
        String str2= "StrutsHibernateJavaJ2e1";

        System.out.println(isOneRotationOfAnother(str1, str2));
    }

    static boolean isOneRotationOfAnother(String str1, String str2){

        char[] ch1= str1.toCharArray();
        TreeSet<Character> set1= new TreeSet ( Arrays.asList(str1));
        char[] ch2= str2.toCharArray();
        TreeSet<Character> set2= new TreeSet ( Arrays.asList(str2));
        if( ch1.length!=ch2.length){
            return false;

        }
        else{

             return set1.equals(set2);
        }

    }
}
