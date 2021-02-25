package Int_JavaChallanges_2;

import java.util.LinkedList;
import java.util.List;

/**
 *  “Better Butter” find  duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.
 */
public class P3_FindDuplicatesInAString {

    public static void main(String[] args) {
        String sent= "Better Butter";
        findDups(sent);
    }


    public static void findDups(String sent) {
        String result = "";

        char[] arr = sent.toCharArray();

        List<Character> listArr = new LinkedList<>();

        for (char element : arr) {
            listArr.add(element);
        }

        for (int i = 0; i < listArr.size(); i++) {
            result += listArr.get(i);
            Character toBeRemoved = listArr.get(i);

            int count = 0;
            while (listArr.contains(toBeRemoved)) {
                listArr.remove(toBeRemoved);
                count++;
            }
            if (count > 1) {
                result += "" + count;
            } else {
                result = result.replace("" + result.charAt(result.length() - 1), "");
            }}
            System.out.println(result);

    }
}
