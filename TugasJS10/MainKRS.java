package TugasJS10;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS queueKRS = new QueueKRS(10);
        int pilihan;

        do {
            System.out.println("--- Menu Antrian KRS ---");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Memproses KRS");
            System.out.println("3. Tampilkan semua antrian");
            System.out.println("4. Tampilkan 2 antrian terdepan");
            System.out.println("5. Tampilkan antrian paling akhir");
            System.out.println("6. Cek jumlah antrian");
            System.out.println("7. Cek jumlah sudah diproses");
            System.out.println("8. Cek jumlah belum diproses");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("--- Daftar Mahasiswa ---");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Program Studi: ");
                    String prodi = sc.nextLine();
                    String dataMhs = nim + ", " + nama + ", " + prodi;
                    queueKRS.menambahAntrian(dataMhs);
                    break;
                case 2:
                    queueKRS.layananKRS();
                    break;
                case 3:
                    queueKRS.tampilkanAntrian();
                    break;
                case 4:
                    queueKRS.AntrianDepan();
                    break;
                case 5:
                    queueKRS.AntrianAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + queueKRS.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah diproses: " + queueKRS.getJumlahProses());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum diproses: " + queueKRS.getJumlahBelumProses());
                    break;
                case 9:
                     queueKRS.clearAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
        