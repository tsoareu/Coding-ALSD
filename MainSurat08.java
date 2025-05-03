package Jobsheet09;

import java.util.Scanner;

public class MainSurat08 {
    public static void main(String[] args) {
        StackSurat08 stackSurat = new StackSurat08();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Masukkan Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat08 suratBaru = new Surat08(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.terimaSurat(suratBaru);
                    break;
                case "2":
                    Surat08 suratDiproses = stackSurat.prosesSurat();
                    if (suratDiproses != null) {
                        System.out.println("Surat yang diproses: " + suratDiproses);
                    }
                    break;
                case "3":
                    Surat08 suratTerakhir = stackSurat.lihatSuratTerakhir();
                    if (suratTerakhir != null) {
                        System.out.println("Surat izin terakhir: " + suratTerakhir);
                    } else {
                        System.out.println("Tidak ada surat izin terakhir.");
                    }
                    break;
                case "4":
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    Surat08 suratDitemukan = stackSurat.cariSurat(namaCari);
                    if (suratDitemukan != null) {
                        System.out.println("Surat ditemukan: " + suratDitemukan);
                    } else {
                        System.out.println("Tidak ada surat izin untuk mahasiswa dengan nama '" + namaCari + "'.");
                    }
                    break;
                case "5":
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
