

public class Dosen08 {
    String idDosen, nama, bidangKeahlian, bidangKeahlianBaru;
    int tahunBergabung, masaKerja;
    boolean statusAktif;

    public Dosen08(String string, String string2, boolean b, int i, String string3) {

    }

    public Dosen08(String idDosen, String nama, String bidangKeahlian, String bidangKeahlianBaru, int tahunBergabung, 
    int masaKerja, boolean statusAktif) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.bidangKeahlianBaru = bidangKeahlianBaru;
        this.tahunBergabung = tahunBergabung;
        this.masaKerja = masaKerja;
        this.statusAktif = statusAktif;
    }
    
    public void tampilInformasi() {
        System.out.println("Nama Dosen : " + nama);
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Tahun bergabung : " + tahunBergabung);
        System.out.println("Bidang keahlian : " + bidangKeahlian);
        System.out.println("Status keaktifan : " + statusAktif);
        System.out.println("Masa kerja " + nama + ": " + masaKerja);
    }

    public void setStatusAktif(boolean statusAktif) {
        if (2025 - tahunBergabung == 30) {
            statusAktif = false;
            System.out.println();
            System.out.println("Dosen " + nama + " sudah tidak aktif.");
        } else {
            statusAktif = true;
            System.out.println();
            System.out.println("Dosen " + nama + " masih aktif.");
        }
        }
    
        public int hitungMasaKerja(int tahunSkrng) {
            return masaKerja = tahunSkrng - tahunBergabung; 
        }
    
        public void ubahKeahlian(String bidangKeahlianBaru) {
            this.bidangKeahlian = bidangKeahlianBaru;
        }
}
