package procedure;

import java.util.Scanner;

public class KonversiWaktu { //pembungkus utama


    static void konversi(int jam) {  
        int menit = jam * 60;
        int detik = jam * 3600;
        System.out.println("Menit = " + menit);
        System.out.println("Detik = " + detik);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //untuk input dari user


        System.out.print("Jam: "); //judul / label / keterangan


        int j = sc.nextInt(); //menyimpan nilai input dari user


        konversi(j); //menerima nilai dari inputan user lalu di oper ke module utama
        sc.close();




    }
}

// prosedur = nge pecah code
// 1. lebih clean
// 2. debugging lebih gampang
// 3. bisa dipakai ulang
// 4. lebih mudah di baca
// 5. lebih mudah di maintain
// 6. lebih mudah di test

// 1. fungsi utama file ini
// 2. ada 2 fungsi, yaitu main dan konversi