package Int_JavaChallanges_2;

/**
 * ) How to check whether given number is binary or not?
 *
 * Write a java program to check whether given number is binary or not.
 * A binary number is a number which contains only 0 or 1.
 * For example : 101101, 110010110, 10010011 are binary numbers.
 * This program is one of the number related basic java programs for interview.
 */
public class P17_IsTheNumberBinary {
    public static void main(String[] args) {
        int num=11001;
        System.out.println(isNumBinary(num));
    }

    static boolean isNumBinary(int num){
        boolean result= true;
        while(num>0){
            if (num%10!=1 && num%10!=0){
                result= false;
            }
            num/=10;
        }
        return result;
    }
}
