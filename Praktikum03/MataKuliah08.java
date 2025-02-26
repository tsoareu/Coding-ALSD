package Praktikum03;

public class MataKuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah08(){

    }
    
    public MataKuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kde, String nama, int sks, int jumlahJam) {
        System.out.println("------------------------");
        System.out.println("Tambah Data Mata Kuliah");
        System.out.println("------------------------");
        this.kode = kde;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void cetakInfo() {
        System.out.println("------------------------");
        System.out.println("Informasi Mata Kuliah");
        System.out.println("------------------------");
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        System.out.println("===========================");
    }
}
