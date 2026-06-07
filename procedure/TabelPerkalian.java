package procedure;

import java.util.Scanner;

public class TabelPerkalian {
    static void cetak(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka: ");
        int n = sc.nextInt();

        cetak(n);
        sc.close();
    }
}