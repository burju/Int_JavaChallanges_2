package Int_JavaChallanges_2;

public class P9_FindSumOfAllDigits {
    public static void main(String[] args) {


        sumOfAllDigits(998);
    }

    static void sumOfAllDigits(int num){
        int sum=0;

        while( num>0){
        sum+=num%10;
        num/=10;
        }
        System.out.println(sum);
    }

}
