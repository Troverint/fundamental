
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan ordo : ");
        int ordo = input.nextInt();
        int[][] matrix = new int[ordo][ordo];
        // int[][] transpose = new int[ordo][ordo];

        for (int i = 0; i < ordo; i++)

            for (int j = 0; j < ordo; j++) {
                System.out.print("baris " + (i + 1) + " kolom " + (j + 1) + ":");
                matrix[i][j] = input.nextInt();
            }

        System.out.println("matrks : ");

        for (

                int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();

        }
        input.close();
    }
}
