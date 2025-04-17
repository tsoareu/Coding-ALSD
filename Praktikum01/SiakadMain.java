import java.util.Scanner;

class Mahasiswa {
    String nim, nama;

    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}

class MataKuliah {
    String kode, namaMK;

    MataKuliah(String kode, String namaMK) {
        this.kode = kode;
        this.namaMK = namaMK;
    }
}

class Penilaian {
    Mahasiswa mhs;
    MataKuliah mk;
    double tugas, uts, uas;

    Penilaian(Mahasiswa mhs, MataKuliah mk, double tugas, double uts, double uas) {
        this.mhs = mhs;
        this.mk = mk;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    double nilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

public class SiakadMain {
    static Penilaian[] data = {
        new Penilaian(new Mahasiswa("22001", "Ali Rahman"), new MataKuliah("MK001", "Struktur Data"), 80, 85, 90),
        new Penilaian(new Mahasiswa("22001", "Ali Rahman"), new MataKuliah("MK002", "Basis Data"), 60, 75, 70),
        new Penilaian(new Mahasiswa("22002", "Budi Santoso"), new MataKuliah("MK001", "Struktur Data"), 75, 70, 80),
        new Penilaian(new Mahasiswa("22003", "Citra Dewi"), new MataKuliah("MK002", "Basis Data"), 85, 90, 95),
        new Penilaian(new Mahasiswa("22003", "Citra Dewi"), new MataKuliah("MK003", "Desain Web"), 80, 90, 65)
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== MENU SIAKAD NILAI ===");
            System.out.println("1. Tampilkan Data Mahasiswa dan Mata Kuliah");
            System.out.println("2. Tampilkan Nilai Mahasiswa");
            System.out.println("3. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1 -> tampilData();
                case 2 -> tampilNilai();
                case 3 -> sortingNilaiAkhir();
                case 4 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = sc.nextLine();
                    searchingNIM(nimCari);
                }
                case 5 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tampilData() {
        System.out.println("\n--- Data Mahasiswa dan Mata Kuliah ---");
        for (Penilaian p : data) {
            System.out.printf("NIM: %s | Nama: %s | Kode MK: %s | Mata Kuliah: %s\n",
                p.mhs.nim, p.mhs.nama, p.mk.kode, p.mk.namaMK);
        }
    }

    static void tampilNilai() {
        System.out.println("\n--- Data Nilai Mahasiswa ---");
        for (Penilaian p : data) {
            System.out.printf("NIM: %s | Nama: %s | MK: %s | Tugas: %.1f | UTS: %.1f | UAS: %.1f | NA: %.2f\n",
                p.mhs.nim, p.mhs.nama, p.mk.namaMK, p.tugas, p.uts, p.uas, p.nilaiAkhir());
        }
    }

    static void sortingNilaiAkhir() {
        Penilaian[] sorted = data.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j].nilaiAkhir() < sorted[j + 1].nilaiAkhir()) {
                    Penilaian temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        System.out.println("\n--- Data Setelah Diurutkan Berdasarkan Nilai Akhir (Descending) ---");
        for (Penilaian p : sorted) {
            System.out.printf("Nama: %s | MK: %s | Nilai Akhir: %.2f\n",
                p.mhs.nama, p.mk.namaMK, p.nilaiAkhir());
        }
    }

    static void searchingNIM(String nim) {
        boolean ditemukan = false;
        System.out.println("\n--- Hasil Pencarian ---");
        for (Penilaian p : data) {
            if (p.mhs.nim.equalsIgnoreCase(nim)) {
                System.out.printf("Nama: %s | MK: %s | Nilai Akhir: %.2f\n",
                    p.mhs.nama, p.mk.namaMK, p.nilaiAkhir());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}


