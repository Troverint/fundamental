package procedure;

import java.util.Scanner;

public class PersegiPanjang {

    static void hitungPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);

        System.out.println("PERSEGI PANJANG        ");
        System.out.printf("Panjang  : %d%n", panjang);
        System.out.printf("Lebar    : %d%n", lebar);
        System.out.printf("Luas     : %d%n", luas);
        System.out.printf("Keliling : %d%n", keliling);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar   : ");
        int l = sc.nextInt();
        System.out.println();

        hitungPersegiPanjang(p, l);

        sc.close();
    }
}