package nhoba;
import java.util.Scanner;

public class GenapGanjil {
    static void Gangep(int apaIni) {
        if (apaIni % 2 == 0) {
            System.out.println("adalah genap");
        } else {
            System.out.println("adalah ganjil");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan angka");
        int angka = sc.nextInt();

        Gangep(angka);
        sc.close();
    }

}
