package Praktikum05;

import java.util.Scanner;

public class DosenDemo08{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] searchResults = {"Hasil 1", "Hasil 2", "Hasil 3"};
    int jmlDosen;
    System.out.print("Masukkan jumlah dosen: ");
    jmlDosen = sc.nextInt();
    DataDosen08 listDosen = new DataDosen08(jmlDosen);
    listDosen.checkSearchResults(searchResults);

    while (true) {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Tambah Data Dosen");
        System.out.println("2. Tampilkan Data Dosen");
        System.out.println("3. Pencarian Data Berdasarkan Nama");
        System.out.println("4. Pencarian Data Berdasarkan Usia");
        System.out.println("5. Sorting ASC (Usia Termuda ke Tertua - Bubble Sort)");
        System.out.println("6. Sorting DSC (Usia Tertua ke Termuda - Insertion Sort)");
        System.out.println("7. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = sc.nextInt();
        sc.nextLine(); 

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Kode Dosen: ");
                String kode = sc.nextLine();
                System.out.print("Masukkan Nama Dosen: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Jenis Kelamin (L/P): ");
                char jk = sc.next().charAt(0);
                System.out.print("Masukkan Usia: ");
                int usia = sc.nextInt();

                boolean jenisKelamin = (jk == 'L' || jk == 'l'); 
                Dosen08 d = new Dosen08(kode, nama, jenisKelamin, usia);
                listDosen.tambah(d);
                System.out.println("Data dosen berhasil ditambahkan!");
                break;

            case 2:
                System.out.println("\n===== Data Dosen =====");
                listDosen.tampil();
                break;

            case 3:
                System.out.println("\n===== Pencarian Data Berdasarkan Nama =====");
                System.out.println("Masukkan nama dosen yang anda cari: ");
                String cari = sc.nextLine();
                listDosen.sequentialSearch(cari);

            case 4:
                System.out.println("Pencarian data berdasarkan Usia");
                System.out.println("-------------------------------------------");
                System.out.print("Masukkan usia dosen yang dicari: ");
                int cari2 = sc.nextInt();
                System.out.println("Menggunakan Binary Search");

                listDosen.sortAscending();
                listDosen.findAndWarnBinarySearch(cari2, 0, jmlDosen - 1);
            break;

            case 5:
            System.out.println("\nMengurutkan data (ASC - Usia termuda ke tertua)...");
                listDosen.sortAscending();
                System.out.println("Data berhasil diurutkan!");
            break;

            case 6:
            System.out.println("\nMengurutkan data (DSC - Usia tertua ke termuda)...");
                listDosen.insertionSort();
                System.out.println("Data berhasil diurutkan!");
                break;
            
            case 7:
            System.out.println("Keluar dari program...");
                sc.close();
                System.exit(0);
                break;

            default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
        }
    }
}
}
