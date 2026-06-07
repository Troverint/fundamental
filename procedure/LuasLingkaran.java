package procedure;
import java.util.Scanner;

public class LuasLingkaran {
    static void hitung(double r) {
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran = " + luas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jari-jari: ");
        double r = sc.nextDouble();

        hitung(r);
        sc.close();
    }
}