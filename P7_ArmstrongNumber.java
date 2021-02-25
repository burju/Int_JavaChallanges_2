package Int_JavaChallanges_2;

/**
 * Write a java program to check whether a given number is Armstrong number or not.
 * A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it.
 * For example: 153, 9474, 54748
 */
public class P7_ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstong(54748));
    }

    static boolean isArmstong(int num){

        //first find the num of digits
        int count=0;
        int sum=0;
        int num2=num;
        int num3=num;

        while(num>0){
            num/=10;
            count++;
        }

        //divide the number into digits
        while(num2>0){
        sum+=Math.pow((num2%10),count);
        num2/=10;
        }

        return (sum==num3);



    }
}
