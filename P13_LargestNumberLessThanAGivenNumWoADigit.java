package Int_JavaChallanges_2;

/**
 * How to find largest number less than a given number and without a given digit?
 *
 * Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not contain a given digit ‘D’.
 * For example, If 145 is the given number and 4 is the given digit,
 * then you should find the largest number less than 145 such that it should not contain 4 in it.
 * In this case, 139 will be the answer. This program is one of the logical programs in java
 */
public class P13_LargestNumberLessThanAGivenNumWoADigit {
    public static void main(String[] args) {
        int num=4582;
        int given=5;

        System.out.println(largestNumThanAGvnDigit(num, given));
    }


    static int largestNumThanAGvnDigit(int num, int given){
        String val= String.valueOf(num);
        String gvn=String.valueOf(given);
        while(val.contains(gvn)){
            num--;
            val=String.valueOf(num);
        }
        return Integer.parseInt(val);
    }
}
