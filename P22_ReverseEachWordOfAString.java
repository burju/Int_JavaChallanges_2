package Int_JavaChallanges_2;

/**
 * 22) How to reverse each word of a string in java?
 *
 * Write a java program to reverse each word of a given string.
 * For example, If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”
 */
public class P22_ReverseEachWordOfAString {
    public static void main(String[] args) {
        String abc="Java Concept Of The Day" ;

        reverseEachWord(abc);
    }

    static void reverseEachWord(String abc){
        String[] arr= abc.split(" ");
        String word="";
        for (String el:arr ) {
            word="";
            for (int i=el.length()-1; i>=0; i--){
                word+= ""+ el.charAt(i);
            } System.out.print(word+" ");
        }
    }
}
