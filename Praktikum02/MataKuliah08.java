

public class MataKuliah08 {
    String kodeMK, nama;
    int sks, jumlahJam, tambahJam, kurangJam;

    public MataKuliah08() {

    }
    
    public MataKuliah08(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode mata kuliah: " + kodeMK);
        System.out.println("Nama mata kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi : " + sksBaru);
    }

    public void tambahJam(int jam) {
        jumlahJam += tambahJam;

    }

    public void kurangJam(int jam) {
        if (jumlahJam <= kurangJam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= kurangJam;
        }
    }

}
