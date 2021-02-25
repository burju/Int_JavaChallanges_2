package Int_JavaChallanges_2;

public class P1_ReverseAString {
    public static void main(String[] args) {
        String sentence="Burcu";
        System.out.println(reverse(sentence));
    }

    public static String reverse(String sent){
        String result="";


        for (int i = sent.length()-1; i >=0 ; i--) {
            result+=sent.charAt(i);
        }



        return result;
    }
}
