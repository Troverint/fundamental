
public class function4 {
    public static int hitungLuas(int panjang, int lebar) { //parameter = menyimpan nilai
        int luas = panjang * lebar; 
        return luas;
    }

    public static void main(String[] args) {
        int m = 19;
        int n = 3;

        int hasil = hitungLuas(m,n);
        
        System.out.println("Panjang : " + m);
        System.out.println("Lebar : " + n);
        System.out.println("Luas persegi panjang : " + hasil);
        
        
    }
}

// parent fucntion 4
// children hitungLuas()
// main