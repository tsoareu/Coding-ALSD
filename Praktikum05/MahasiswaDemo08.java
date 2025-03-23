package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlh = sc.nextInt();
        sc.nextLine();
        System.out.println();

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();

        for (int i = 0; i < jmlh; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa08 mhs =  new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        System.out.println("------------------------------");
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        list.insertionSort();
        System.out.println("Data mahasiswa setelah sorting denan Insertion Sort (DESC): ");
        list.tampil();
    }
}
