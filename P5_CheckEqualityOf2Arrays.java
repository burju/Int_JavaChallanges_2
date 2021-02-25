package Int_JavaChallanges_2;

import java.util.Arrays;

public class P5_CheckEqualityOf2Arrays {

    public static void main(String[] args) {
        char[] arr1={'a', 'b','b','c'};
        char[] arr2={'a', 'b','b','c'};

        System.out.println(checkEquality(arr1, arr2));
    }

    static boolean checkEquality(char[] arr1, char[] arr2){

        return Arrays.equals(arr2, arr2);

    }
}
