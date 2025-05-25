package TugasJS11;

import java.util.Scanner;

public class MainAntri08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Slot antri yang disediakan : ");
        int slotAntri = sc.nextInt();
        sc.nextLine(); 
        System.out.println("");

        MethodAntri08 antrian = new MethodAntri08(slotAntri);

        while (true) {
            System.out.println("=== Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Pendaftaran");
            System.out.println("2. Pelayanan");
            System.out.println("3. Lihat antrian pertama");
            System.out.println("4. Lihat antrian terakhir");
            System.out.println("5. Cek jumlah dan daftar antrian");
            System.out.println("6. Cek apakah antrian kosong");
            System.out.println("7. Cek apakah antrian penuh");
            System.out.println("8. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                if (antrian.isFull()) {
                System.out.println("Maaf, antrian sudah penuh" + " (terisi : " + antrian.slotAntri + " mahasiswa)");
                } else {
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Keterangan: ");
                    String keterangan = sc.nextLine();
                    AntriLayanan08 mhsDaftar = new AntriLayanan08(nama, nim, prodi, keterangan);
                    antrian.enqueue(mhsDaftar);
                }
                    break;
                case "2":
                    antrian.dequeue();
                    break;
                case "3":
                    AntriLayanan08 depan = antrian.peek();
                    if (depan != null) {
                        System.out.println("Antrian pertama: " + depan.nama);
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case "4":
                    AntriLayanan08 belakang = antrian.peekLast();
                    if (belakang != null) {
                        System.out.println("Antrian terakhir: " + belakang.nama);
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case "5":
                    System.out.println("Jumlah antrian: " + antrian.size());
                    antrian.printAntrian();
                    System.out.println("");
                    break;
                case "6":
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong (pilih menu 5 untuk melihat daftar antrian)");
                    }
                    break;
                case "7":
                    if (antrian.isFull()) {
                        System.out.println("Maaf, antrian sudah penuh (" + antrian.slotAntri + " mahasiswa)");
                    } else {
                        System.out.println("Slot antri tersedia: " + (antrian.slotAntri - antrian.size()));
                    }
                    break;
                case "8":
                    antrian.clear();
                    break;
                case "0":
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}