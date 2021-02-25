package Int_JavaChallanges_2;

import java.util.Scanner;

public class P4_RemoveAllWhiteSpaces {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence, I will remove the spaces");
        String sent= input.nextLine();

        System.out.println(removeSpaces(sent));
    }

    public static String removeSpaces(String sent){
        while (sent.contains(" ")){
            sent= sent.replace(" ", "");

        }
        return sent;
    }
}
