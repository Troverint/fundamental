package record;

record Produk(String kode, String nama, double harga, int stok) {
    double nilaiStok() {
        return harga * stok;
    }
}

public class produkM {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Laptop", 15000000, 10);
        Produk p2 = new Produk("P002", "Smartphone", 5000000, 20);

        System.out.println("Produk: " + p1.nama() + ", Nilai Stok: " + p1.nilaiStok());
        System.out.println("Produk: " + p2.nama() + ", Nilai Stok: " + p2.nilaiStok());
    }
}
