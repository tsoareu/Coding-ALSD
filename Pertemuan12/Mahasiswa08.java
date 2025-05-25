package Pertemuan12;

public class Mahasiswa08 {
    String nama;
    String nim;
    String kodeKelas;
    double ipk;

    public Mahasiswa08(String nama, String nim, String kodeKelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kodeKelas = kodeKelas;
        this.ipk = ipk;
    }

    public String tampilInformasi() {
    return nama + "\t" + nim + "\t\t" + kodeKelas + "\t" + String.format("%.1f", ipk);
}
}
