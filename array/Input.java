
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    int[][] matrik = new int[3][3];
    int i, j;
    Scanner input = new Scanner(System.in);
    // input array 2 dimensi

    for(i=0;i<3;i++)
    {
        for (j = 0; j < 3; j++) {
            System.out.println("Masukan Bilangan " + "[" + i + "]" + "[" + j + "]=");
            matrik[i][j] = input.nextInt();
        }
    }

    // cetak array 2 dimensi
    for(i=0;i<3;i++)
    {
        for (j = 0; j < 3; j++) {
            System.out.println(matrik[i][j] + "");
        }
        System.out.println();
    }
    input.close();

}
}
