package Int_JavaChallanges_2;

/**
 * 20) How to check whether user input is number or not in java?
 *
 * Write a java program to check whether user has entered a number or not.
 */
public class P20_IsTheInputANumber {
    public static void main(String[] args) {
        String input= "7";

        System.out.println(isItANum(input));
    }
    static boolean isItANum(String inpt){
        try{
            Integer.parseInt(inpt);
        }
        catch (NumberFormatException ex){
            ex.getMessage();
            return false;
        }
        return true;
    }
}
