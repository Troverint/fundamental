package procedure;
import java.util.Scanner;

public class KalkulatorNilaiMahasiswa {

    static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.30) + (uts * 0.35) + (uas * 0.35);
    }

    static String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 85)
            return "A";
        else if (nilaiAkhir >= 75)
            return "B";
        else if (nilaiAkhir >= 65)
            return "C";
        else if (nilaiAkhir >= 55)
            return "D";
        else
            return "E";
    }

    static void tampilkanHasil(String nama, double nilaiAkhir, String grade) {
        String status = grade.equals("E") ? "TIDAK LULUS" : "LULUS";

        System.out.println("\nHasil Akhir:");
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade       : " + grade);
        System.out.println("Status      : " + status);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kalkulator penghitung nilai");

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Nilai Tugas : ");
        double tugas = sc.nextDouble();

        System.out.print("Nilai UTS   : ");
        double uts = sc.nextDouble();

        System.out.print("Nilai UAS   : ");
        double uas = sc.nextDouble();

        double nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas);
        String grade = tentukanGrade(nilaiAkhir);
        tampilkanHasil(nama, nilaiAkhir, grade);
        sc.close();
    }
}