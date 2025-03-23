package Praktikum05;

public class Dosen {
    String kode, nama;
    int usia;
    boolean jenisKelamin;

    public Dosen(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    
    public void tampil() {
        System.out.println("Kode Dosen: " + kode);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia + " tahun");
    }
}


