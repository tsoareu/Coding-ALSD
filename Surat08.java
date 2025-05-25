package Jobsheet09;

class Surat08 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat08(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String toString() {
        return "ID Surat: " + idSurat + ", Nama: " + namaMahasiswa + ", Kelas: " + kelas + ", Jenis Izin: " + jenisIzin + ", Durasi: " + durasi + " hari";
    }
}


