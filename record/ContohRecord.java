package record;
// ============================================================
//  ContohRecord.java — 7 Contoh Penggunaan Record di Java
//  Membutuhkan Java 16 atau lebih baru
// ============================================================

// ── Contoh 1: Pegawai ───────────────────────────────────────
record Pegawai(String kd, String nama, String jabatan, int gaji) {}

// ── Contoh 2: Produk ────────────────────────────────────────
record Produk(String kode, String nama, double harga, int stok) {
    double nilaiStok() {
        return harga * stok;
    }
}

// ── Contoh 3: Mahasiswa ─────────────────────────────────────
record Mahasiswa(String nim, String nama, String jurusan, double ipk) {
    // Compact constructor: validasi IPK
    Mahasiswa {
        if (ipk < 0.0 || ipk > 4.0)
            throw new IllegalArgumentException("IPK tidak valid: " + ipk);
    }

    String predikat() {
        if (ipk >= 3.5) return "Cumlaude";
        if (ipk >= 3.0) return "Sangat Memuaskan";
        return "Memuaskan";
    }
}

// ── Contoh 4: Titik ─────────────────────────────────────────
record Titik(double x, double y) {
    double jarakKe(Titik lain) {
        double dx = this.x - lain.x();
        double dy = this.y - lain.y();
        return Math.sqrt(dx * dx + dy * dy);
    }

    static Titik asal() {
        return new Titik(0, 0);
    }
}

// ── Contoh 5: Buku ──────────────────────────────────────────
record Buku(String isbn, String judul, String pengarang, int tahun, double harga) {
    String info() {
        return judul + " oleh " + pengarang + " (" + tahun + ")";
    }

    boolean terbitSebelum(int thn) {
        return tahun < thn;
    }
}

// ── Contoh 6: Transaksi (record bersarang) ──────────────────
record Pelanggan(String id, String nama) {}

record Transaksi(
        String    noFaktur,
        Pelanggan pelanggan,
        String    barang,
        int       jumlah,
        double    hargaSatuan) {

    double total()      { return jumlah * hargaSatuan; }
    double pajak()      { return total() * 0.11; }   // PPN 11%
    double grandTotal() { return total() + pajak(); }
}

// ── Contoh 7: Kontak (record bersarang + validasi) ──────────
record Alamat(String jalan, String kota, String kodePos) {}

record Kontak(String nama, String noHp, String email, Alamat alamat) {
    // Compact constructor: validasi nomor HP
    Kontak {
        if (!noHp.startsWith("08"))
            throw new IllegalArgumentException("Nomor HP harus diawali 08");
    }

    String infoLengkap() {
        return nama + " | " + noHp + " | " + alamat.kota();
    }
}

// ── Main ────────────────────────────────────────────────────
public class ContohRecord {

    static void garis() {
        System.out.println("─".repeat(45));
    }

    public static void main(String[] args) {

        // ── 1. Pegawai ──────────────────────────────────────
        garis();
        System.out.println("CONTOH 1 — Pegawai");
        garis();
        Pegawai p1 = new Pegawai("001", "Budi Santoso", "Manager",   8_000_000);
        Pegawai p2 = new Pegawai("002", "Siti Rahayu",  "Staff",     4_500_000);

        System.out.println("Kode    : " + p1.kd());
        System.out.println("Nama    : " + p1.nama());
        System.out.println("Jabatan : " + p1.jabatan());
        System.out.println("Gaji    : " + p1.gaji());
        System.out.println(p2);

        // ── 2. Produk ───────────────────────────────────────
        garis();
        System.out.println("CONTOH 2 — Produk");
        garis();
        Produk pr = new Produk("PRD-01", "Laptop", 12_000_000.0, 5);

        System.out.println("Kode       : " + pr.kode());
        System.out.println("Nama       : " + pr.nama());
        System.out.println("Harga      : " + pr.harga());
        System.out.println("Stok       : " + pr.stok());
        System.out.println("Nilai Stok : " + pr.nilaiStok());

        // ── 3. Mahasiswa ────────────────────────────────────
        garis();
        System.out.println("CONTOH 3 — Mahasiswa");
        garis();
        Mahasiswa mhs = new Mahasiswa("2023001", "Rina", "Informatika", 3.82);

        System.out.println("NIM      : " + mhs.nim());
        System.out.println("Nama     : " + mhs.nama());
        System.out.println("Jurusan  : " + mhs.jurusan());
        System.out.println("IPK      : " + mhs.ipk());
        System.out.println("Predikat : " + mhs.predikat());

        // ── 4. Titik ────────────────────────────────────────
        garis();
        System.out.println("CONTOH 4 — Titik");
        garis();
        Titik a = new Titik(0, 0);
        Titik b = new Titik(3, 4);

        System.out.println("Titik A : " + a);
        System.out.println("Titik B : " + b);
        System.out.println("Jarak   : " + a.jarakKe(b));

        // ── 5. Buku ─────────────────────────────────────────
        garis();
        System.out.println("CONTOH 5 — Buku");
        garis();
        Buku buku1 = new Buku("978-001", "Pemrograman Java", "Ahmad", 2020, 95_000.0);
        Buku buku2 = new Buku("978-002", "Struktur Data",    "Dewi",  2018, 85_000.0);

        System.out.println(buku1.info());
        System.out.println(buku2.info());
        System.out.println("Buku2 terbit sebelum 2019? " + buku2.terbitSebelum(2019));

        // ── 6. Transaksi ────────────────────────────────────
        garis();
        System.out.println("CONTOH 6 — Transaksi");
        garis();
        Pelanggan cust = new Pelanggan("C001", "Toko Maju");
        Transaksi trx  = new Transaksi("INV-2024-001", cust, "Monitor", 2, 2_500_000.0);

        System.out.println("No Faktur   : " + trx.noFaktur());
        System.out.println("Pelanggan   : " + trx.pelanggan().nama());
        System.out.println("Barang      : " + trx.barang());
        System.out.println("Jumlah      : " + trx.jumlah());
        System.out.println("Harga/pcs   : " + trx.hargaSatuan());
        System.out.println("Total       : " + trx.total());
        System.out.println("Pajak (11%) : " + trx.pajak());
        System.out.println("Grand Total : " + trx.grandTotal());

        // ── 7. Kontak ───────────────────────────────────────
        garis();
        System.out.println("CONTOH 7 — Kontak");
        garis();
        Alamat adr = new Alamat("Jl. Sudirman No. 10", "Jakarta", "10220");
        Kontak kontak = new Kontak("Andi", "081234567890", "andi@email.com", adr);

        System.out.println("Info      : " + kontak.infoLengkap());
        System.out.println("Jalan     : " + kontak.alamat().jalan());
        System.out.println("Kota      : " + kontak.alamat().kota());
        System.out.println("Kode Pos  : " + kontak.alamat().kodePos());
        System.out.println("Email     : " + kontak.email());
        garis();
    }
}