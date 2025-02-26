
public class Mahasiswa08 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa08() {

    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }   

    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    } 

    public void updateIpk(double ipkBaru) {
        if (0.00 <= ipkBaru && ipkBaru >= 4.00) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        } else {
            ipk = ipkBaru;
        }
    }

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public Mahasiswa08(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    } 
}

