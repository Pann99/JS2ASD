public class Buku23 {

    private String judul;
    private String pengarang;
    private int halaman;
    private int stok;
    private int harga;

    public Buku23(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("===========================");
    }

    public int hitungHargaTotal(int jmlBukuTerjual) {
        return harga * jmlBukuTerjual;
    }

    public double hitungDiskon(int hargaTotal) {
        double diskon = 0;
        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }
        return diskon;
    }

    public double hitungHargaBayar(int hargaTotal) {
        double diskon = hitungDiskon(hargaTotal);
        return hargaTotal - (hargaTotal * diskon);
    }

    public void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    public void restock(int jml) {
        stok += jml;
    }

    public void gantiHarga(int hrg) {
        harga = hrg;
    }
}
