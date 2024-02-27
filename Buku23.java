public class Buku23 {
    // Atribut
    private String judul;
    private String pengarang;
    private int halaman;
    private int stok;
    private int harga;

    // Constructor
    public Buku23(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi buku
    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("===========================");
    }

    // Method untuk menghitung harga total
    public int hitungHargaTotal(int jmlBukuTerjual) {
        return harga * jmlBukuTerjual;
    }

    // Method untuk menghitung diskon
    public double hitungDiskon(int hargaTotal) {
        double diskon = 0;
        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }
        return diskon;
    }

    // Method untuk menghitung harga bayar setelah diskon
    public double hitungHargaBayar(int hargaTotal) {
        double diskon = hitungDiskon(hargaTotal);
        return hargaTotal - (hargaTotal * diskon);
    }

    // Method untuk menjual buku
    public void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    // Method untuk menambah stok buku
    public void restock(int jml) {
        stok += jml;
    }

    // Method untuk mengganti harga buku
    public void gantiHarga(int hrg) {
        harga = hrg;
    }
}
