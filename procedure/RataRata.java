
package procedure;
import java.util.Scanner;

public class RataRata {
    static void hitungRata(int a, int b, int c) {
        double rata = (a + b + c) / 3.0;
        System.out.println("Rata-rata = " + rata);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai 1: ");
        int a = sc.nextInt();
        System.out.print("Nilai 2: ");
        int b = sc.nextInt();
        System.out.print("Nilai 3: ");
        int c = sc.nextInt();

        hitungRata(a, b, c);
        sc.close();
    }
} 



