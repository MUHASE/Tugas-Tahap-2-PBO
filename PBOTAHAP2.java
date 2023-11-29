/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.tahap.pkg2;

/**
 *
 * @author Asus
 */
public class PBOTAHAP2 {

    public static void main(String[] args) {
        // Membuat objek sesuai dengan diagram objek yang telah diberikan
        Anggota anggota1 = new Anggota("Hasheghi", "B112233", "Bandar Lampung No. 10");
        Admin admin1 = new Admin("AdminAccessLevel");
        Buku buku1 = new Buku("The Art of Programming", "Antariksa Geghana", "978-0201896831", "Available");
        Notifikasi notifikasi1 = new Notifikasi("Email");
        TransaksiPeminjaman transaksiPeminjaman1 = new TransaksiPeminjaman(anggota1, buku1, "2023-01-01");
        TransaksiPengembalian transaksiPengembalian1 = new TransaksiPengembalian(anggota1, buku1, "2023-01-15");

        // Mengaitkan objek sesuai dengan asosiasi yang telah diberikan
        admin1.kirimPemberitahuan("Pesan penting", anggota1);
        admin1.kelolaInformasiAnggota(anggota1);
        notifikasi1.kirimPemberitahuan("Pesan notifikasi");

        // Menampilkan informasi hasil
        System.out.println("Informasi Anggota:");
        System.out.println("Nama: " + anggota1.getNama());
        System.out.println("Nomor Anggota: " + anggota1.getPassword());
        System.out.println("Alamat: " + anggota1.getAlamat());
        System.out.println("Catatan Peminjaman: " + anggota1.getCatatanPeminjaman());
        System.out.println("Transaksi Peminjaman Anggota:");
        for (TransaksiPeminjaman transaksi : anggota1.getTransaksiPeminjamans()) {
            System.out.println("- Buku: " + transaksi.getBuku().getJudul());
            System.out.println("  Tanggal Pinjam: " + transaksi.getTanggalPinjam());
        }
        System.out.println();

        System.out.println("Informasi Admin:");
        System.out.println("Hak Akses: " + admin1.getHakAkses());
        System.out.println("Notifikasi Admin:");
        for (Notifikasi notifikasi : admin1.getNotifikasis()) {
            System.out.println("- Metode Pengiriman: " + notifikasi.getMetodePengiriman());
        }
        System.out.println("Anggota yang Dikelola oleh Admin:");
        for (Anggota anggota : admin1.getAnggotas()) {
            System.out.println("- Nama Anggota: " + anggota.getNama());
        }
        System.out.println("Buku yang Dikelola oleh Admin:");
        for (Buku buku : admin1.getBukus()) {
            System.out.println("- Judul Buku: " + buku.getJudul());
        }
        System.out.println("Transaksi Peminjaman yang Dicatat oleh Admin:");
        for (TransaksiPeminjaman transaksi : admin1.getTransaksiPeminjamans()) {
            System.out.println("- Buku: " + transaksi.getBuku().getJudul());
            System.out.println("  Tanggal Pinjam: " + transaksi.getTanggalPinjam());
        }
        System.out.println("Transaksi Pengembalian yang Dicatat oleh Admin:");
        for (TransaksiPengembalian transaksi : admin1.getTransaksiPengembalians()) {
            System.out.println("- Buku: " + transaksi.getBuku().getJudul());
            System.out.println("  Tanggal Kembali: " + transaksi.getTanggalKembali());
        }
    }
}
