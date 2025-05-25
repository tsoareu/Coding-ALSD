package TugasJS11;

public class AntriLayanan08 {
    String nama;
    String nim;
    String prodi;
    String keterangan;


    public AntriLayanan08(String nama, String nim, String prodi, String keterangan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.keterangan = keterangan;
    }

    public String tampilInformasi() {
        return nama + nim + prodi + keterangan;
    }
}
