package record;
record Pegawai(String kd, String nama, String jabatan, int gaji) {
}

public class ContohRecordArrayPegawai {

    public static void main(String[] args) {

        // Membuat array of record
        Pegawai[] pegawai = {
                new Pegawai("001", "Budi Santoso", "Manager", 8_000_000),
                new Pegawai("002", "Siti Rahayu", "Staff", 4_500_000),
                new Pegawai("003", "Andi Pratama", "Supervisor", 6_000_000),
                new Pegawai("004", "Dewi Lestari", "Staff", 4_200_000),
                new Pegawai("005", "Roni Susanto", "HRD", 5_300_000),
        };

        // Tampilkan semua data
        System.out.println("DATA PEGAWAI");
        System.out.printf("%-5s %-20s %-15s %12s%n", "Kd", "Nama", "Jabatan", "Gaji");
        for (Pegawai p : pegawai) {
            System.out.printf("%-5s %-20s %-15s %,12d%n",
                    p.kd(), p.nama(), p.jabatan(), p.gaji());
        }

        // Hitung total dan rata-rata gaji
        int total = 0;
        for (Pegawai p : pegawai)
            total += p.gaji();
        System.out.printf("Total gaji     : Rp %,d%n", total);
        System.out.printf("Rata-rata gaji : Rp %,.0f%n", (double) total / pegawai.length);

        // Cari gaji tertinggi
        Pegawai tertinggi = pegawai[0];
        for (Pegawai p : pegawai) {
            if (p.gaji() > tertinggi.gaji())
                tertinggi = p;
        }
        System.out.println("\nGaji tertinggi : " + tertinggi.nama()
                + " (Rp " + String.format("%,d", tertinggi.gaji()) + ")");
    }
}
