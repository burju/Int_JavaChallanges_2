package Int_JavaChallanges_2;

/**
 * 15) How to find continuous sub array whose sum is equal to given number?
 *
 * Write a java program to find continuous sub array of the given array whose sum is equal to a given number.
 * For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number,
 * then you have to find continuous sub array in this array such that whose elements add up to 45.
 * In this case, {5, 31, 9} is such sub array whose elements add up to 45.
 */
public class P15_SubArrayWhichSumsUpToAGivenNumber_DOITAGAIN {
    public static void main(String[] args) {
   int[] arr= {12, 5, 31, 9, 21, 8};
   int num=45;
   subArr(arr, num);
    }
    static void subArr(int[] arr, int num) {

   int sum=0;
   int start=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+= arr[i];
            while( sum>num){
            sum-=arr[start];
            start++;
            }

            if(sum==num){
                for (int j=start; j<=i; j++){
                    System.out.print(arr[j]+" ");
                }
            }


        }



    }
    }

