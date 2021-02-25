package Int_JavaChallanges_2;

public class P2_CreateAPyramideOfNumbers {
    public static void main(String[] args) {
        int n=9;
        buildPyramide(n);
    }


    public static void buildPyramide(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
