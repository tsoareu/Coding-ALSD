import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
            System.out.println("======================");
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                tampilkanSeluruhJadwal(namaMK, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah: ");
                String hari = sc.nextLine();
                tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah, hari);
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                int sem = sc.nextInt();
                tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah, sem);
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                String nama = sc.nextLine();
                cariMataKuliah(namaMK, sks, semester, hariKuliah, nama);
            } else if (pilihan == 5) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        sc.close();
    }

    public static void tampilkanSeluruhJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n=======================");
        System.out.println("       Jadwal Kuliah");
        System.out.println("=======================");
        if (namaMK.length == 0) {
            System.out.println("Tidak ada jadwal mata kuliah.");
            return;
        }
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s%n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
        }
        System.out.println("=======================");
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        boolean ada = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada mata kuliah pada hari " + hari);
        }
    }

    
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        boolean ada = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada mata kuliah di semester " + sem);
        }
    }

    public static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String nama) {
        System.out.println("\nHasil Pencarian Mata Kuliah:");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(nama)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}



