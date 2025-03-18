package Praktikum03;

public class Dosen08 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen08(String kode2, String nama2, Boolean jenisKelamin2, int usia2) {
    kode = kode2;
    nama = nama2;
    jenisKelamin = jenisKelamin2;
    usia = usia2;
    }

    public void tampilkanInfo() {
        System.out.println();
        System.out.println("Informasi Data Dosen");
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "P" : "W"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------");
        }
    }

