package procedure;
import java.util.Scanner;

public class GenapGanjil {

    static void cekAngka(int n) { //3. nomor yang masukin user, diterima



        if (n % 2 == 0) //4. nomor yang masukin user, di cek apakah itu genap atau ganjil
            System.out.println("Genap"); //end
        else
            System.out.println("Ganjil"); //end





    }
   
    
    public static void main(String[] args) { //fungsi utama
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt(); //1. user masukin nomor
        
        cekAngka(n); //2. module menerima nilai dan mengopernya ke fungsi asalnya
        sc.close();
    }

 
}

//parameter = tempat menyimpan nilai

//fungsi utama
// strukturnya
// teknologinya




// ini fungsi untuk mngecek bilangan apakah itu genap atau ganjil
// disni menggunakan method procedure, dimana fungsi dibagi menjadi beberapa module
// fungsi di file dibagi menjadi 2, yaitu fungsi untuk mngecek genap ganjil, dan fungsi utama (untuk memanggil module module)
// if else = pengkondisian, if else


// operator operasi hitung
// 1. +
// 2. -
// 3. *
// 4. /
// 5. ^
// 6. %
// 7. =+
// 8. =-
// 9. =*