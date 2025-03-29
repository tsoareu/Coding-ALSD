package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();
        input.nextLine();

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jmlMhs);

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println("-----------------------------------");

            Mahasiswa08 m =  new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(m);
        }
            list.tampil();
            
            System.out.println("-------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("-------------------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = input.nextDouble();

            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int) posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);

            list.bubbleSort();
            System.out.println("--------------------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("--------------------------------------");
            double posisi2 = list.findBinarySearch(cari, 0, jmlMhs-1);
            int pss2 = (int) posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);
    
        input.close();
    }
}

