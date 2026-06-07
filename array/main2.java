import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        /*
         * int[][] data = {{6,3,4}, {1,7,8}};
         * for (int b=0; b<3; b++){
         * for (int k=0;k<3;k++){
         * System.out.print(data[b][k]+" ");
         * }
         * System.out.println();
         * }
         */

        int[][] matrik = new int[3][3];
        int i, j;
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(" Input Bilangan " + "[" + i + "]" + "[" + j + "] = ");
                matrik[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matrik[i][j] + " ");
            }
            System.out.println();
        }

    }
}