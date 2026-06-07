package record;

record Pegawai(String kd, String nama, String jabatan, int gaji) {
}

public class PegawaiMain {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("P001", "Alice", "Manager", 10000000);
        Pegawai p2 = new Pegawai("P002", "Bob", "Staff", 5000000);

        System.out.println("Kode: " + p1.kd());
        System.out.println("Nama: " + p1.nama());
        System.out.println("Jabatan: " + p1.jabatan());
        System.out.println("Gaji: " + p1.gaji());

        System.out.println("\nKode: " + p2.kd());
        System.out.println("Nama: " + p2.nama());
        System.out.println("Jabatan: " + p2.jabatan());
        System.out.println("Gaji: " + p2.gaji());
    }
}
