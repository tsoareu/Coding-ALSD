package Praktikum05;

import java.util.Scanner;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0; 

    void tambah(Dosen d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data penuh, tidak bisa menambah dosen lagi.");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("---------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                  
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen key = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen dataDosen = new DataDosen();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda - Insertion Sort)");
            System.out.println("5. Keluar");
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
                    Dosen d = new Dosen(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(d);
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n===== Data Dosen =====");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("\nMengurutkan data (ASC - Usia termuda ke tertua)...");
                    dataDosen.SortingASC();
                    System.out.println("Data berhasil diurutkan!");
                    break;

                case 4:
                    System.out.println("\nMengurutkan data (DSC - Usia tertua ke termuda)...");
                    dataDosen.insertionSort();
                    System.out.println("Data berhasil diurutkan!");
                    break;

                case 5:
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


