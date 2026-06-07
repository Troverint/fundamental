package procedure;
import java.util.Scanner;

public class CekBilanganPrima {

    static void cekPrima(int n) {
        if (n < 2) {
            System.out.println(n + " bukan bilangan prima");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " bukan bilangan prima");
                return;
            }
        }
        System.out.println(n + " adalah bilangan prima");
    }


    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        cekPrima(angka);
        sc.close();
    }
}