/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.tahap.pkg2;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.List;

class Anggota {
	private String nama;
	private String password;
	private String alamat;
	private String catatanPeminjaman;
	private List<TransaksiPeminjaman> transaksiPeminjamans;

	public Anggota(String nama, String nomorAnggota, String alamat) {
    	this.nama = nama;
    	this.password = nomorAnggota;
    	this.alamat = alamat;
    	this.catatanPeminjaman = "";
    	this.transaksiPeminjamans = new ArrayList<>();
	}

	// Getter and Setter
	public String getNama() {
    	return nama;
	}

	public void setNama(String nama) {
    	this.nama = nama;
	}

	public String getPassword() {
    	return password;
	}

	public void setNomorAnggota(String nomorAnggota) {
    	this.password = nomorAnggota;
	}

	public String getAlamat() {
    	return alamat;
	}

	public void setAlamat(String alamat) {
    	this.alamat = alamat;
	}

	public String getCatatanPeminjaman() {
    	return catatanPeminjaman;
	}

	public void setCatatanPeminjaman(String catatanPeminjaman) {
    	this.catatanPeminjaman = catatanPeminjaman;
	}

	public List<TransaksiPeminjaman> getTransaksiPeminjamans() {
    	return transaksiPeminjamans;
	}

	public void setTransaksiPeminjamans(List<TransaksiPeminjaman> transaksiPeminjamans) {
    	this.transaksiPeminjamans = transaksiPeminjamans;
	}

	// Metode Fungsi
	public void login(String username, String password) {
    	// Implementasi login
	}

	public Buku cariBuku(String judul) {
    	// Implementasi pencarian buku
    	return new Buku("The Art of Programming", "Donald Knuth", "978-0201896831", "Available");
	}

	public TransaksiPeminjaman pinjamBuku(Buku buku) {
    	// Implementasi peminjaman buku
    	TransaksiPeminjaman transaksi = new TransaksiPeminjaman(this, buku, "2023-01-01");
    	transaksiPeminjamans.add(transaksi);
    	return transaksi;
	}

	public void kembalikanBuku(TransaksiPeminjaman transaksi) {
    	// Implementasi pengembalian buku
    	// ...

    	// Contoh penggunaan: menghapus transaksi dari daftar transaksi peminjaman
    	transaksiPeminjamans.remove(transaksi);
	}

	public void terimaNotifikasi(String pesan) {
    	// Implementasi penerimaan notifikasi
	}
}

class Admin {
    private String hakAkses;
    private List<Notifikasi> notifikasis;
    private List<Anggota> anggotas;
    private List<Buku> bukus;
    private List<TransaksiPeminjaman> transaksiPeminjamans;
    private List<TransaksiPengembalian> transaksiPengembalians;

    public Admin(String hakAkses) {
        this.hakAkses = hakAkses;
        this.notifikasis = new ArrayList<>();
        this.anggotas = new ArrayList<>();
        this.bukus = new ArrayList<>();
        this.transaksiPeminjamans = new ArrayList<>();
        this.transaksiPengembalians = new ArrayList<>();
    }

    // Getter and Setter
    public String getHakAkses() {
        return hakAkses;
    }

    public void setHakAkses(String hakAkses) {
        this.hakAkses = hakAkses;
    }

    public List<Notifikasi> getNotifikasis() {
        return notifikasis;
    }

    public void setNotifikasis(List<Notifikasi> notifikasis) {
        this.notifikasis = notifikasis;
    }

    public List<Anggota> getAnggotas() {
        return anggotas;
    }

    public void setAnggotas(List<Anggota> anggotas) {
        this.anggotas = anggotas;
    }

    public List<Buku> getBukus() {
        return bukus;
    }

    public void setBukus(List<Buku> bukus) {
        this.bukus = bukus;
    }

    public List<TransaksiPeminjaman> getTransaksiPeminjamans() {
        return transaksiPeminjamans;
    }

    public void setTransaksiPeminjamans(List<TransaksiPeminjaman> transaksiPeminjamans) {
        this.transaksiPeminjamans = transaksiPeminjamans;
    }

    public List<TransaksiPengembalian> getTransaksiPengembalians() {
        return transaksiPengembalians;
    }

    public void setTransaksiPengembalians(List<TransaksiPengembalian> transaksiPengembalians) {
        this.transaksiPengembalians = transaksiPengembalians;
    }

    // Metode Fungsi
    public void kelolaInformasiAnggota(Anggota anggota) {
        // Implementasi pengelolaan informasi anggota
        anggotas.add(anggota);
    }

    public void updateKoleksiBuku(Buku buku) {
        // Implementasi pembaruan koleksi buku
        bukus.add(buku);
    }

    public void catatPeminjaman(TransaksiPeminjaman transaksi) {
        // Implementasi pencatatan peminjaman
        transaksiPeminjamans.add(transaksi);
    }

    public void catatPengembalian(TransaksiPengembalian transaksi) {
        // Implementasi pencatatan pengembalian
        transaksiPengembalians.add(transaksi);
    }

    public void kirimPemberitahuan(String pesan, Anggota penerima) {
        // Implementasi pengiriman pemberitahuan
        Notifikasi notifikasi = new Notifikasi("Email");
        notifikasi.kirimPemberitahuan(pesan);
        notifikasis.add(notifikasi);
        penerima.getTransaksiPeminjamans().add(new TransaksiPeminjaman(penerima, new Buku("Judul Buku", "Pengarang", "ISBN123", "Available"), "2023-01-01"));
    }
}

class Buku {
    private String judul;
    private String pengarang;
    private String nomorSBN;
    private String statusKetersediaan;

    public Buku(String judul, String pengarang, String nomorSBN, String statusKetersediaan) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorSBN = nomorSBN;
        this.statusKetersediaan = statusKetersediaan;
    }

    // Getter and Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getNomorSBN() {
        return nomorSBN;
    }

    public void setNomorSBN(String nomorSBN) {
        this.nomorSBN = nomorSBN;
    }

    public String getStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(String statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
}

class Notifikasi {
    private String metodePengiriman;
    private List<Anggota> daftarPenerima;

    public Notifikasi(String metodePengiriman) {
        this.metodePengiriman = metodePengiriman;
        this.daftarPenerima = new ArrayList<>();
    }

    // Getter and Setter
    public String getMetodePengiriman() {
        return metodePengiriman;
    }

    public void setMetodePengiriman(String metodePengiriman) {
        this.metodePengiriman = metodePengiriman;
    }

    public List<Anggota> getDaftarPenerima() {
        return daftarPenerima;
    }

    public void setDaftarPenerima(List<Anggota> daftarPenerima) {
        this.daftarPenerima = daftarPenerima;
    }

    // Metode Fungsi
    public void kirimPemberitahuan(String pesan) {
        // Implementasi pengiriman pemberitahuan
        for (Anggota penerima : daftarPenerima) {
            // Implementasi pengiriman notifikasi ke setiap anggota
            penerima.terimaNotifikasi(pesan);
        }
    }

    public void aturMetodePengiriman(String metode) {
        // Implementasi pengaturan metode pengiriman
        this.metodePengiriman = metode;
    }
}

class TransaksiPeminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;

    public TransaksiPeminjaman(Anggota anggota, Buku buku, String tanggalPinjam) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
    }

    // Getter and Setter
    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }
}

class TransaksiPengembalian {
    private Anggota anggota;
    private Buku buku;
    private String tanggalKembali;

    public TransaksiPengembalian(Anggota anggota, Buku buku, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalKembali = tanggalKembali;
    }

    // Getter and Setter
    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
}