package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mata kuliah yang akan diiinput : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        MataKuliah08[] arrayOfMatakuliah = new MataKuliah08[jmlMatkul];
       // String kode, nama, dummy;
       // int sks, jumlahJam;

        for (int i=0; i <3; i++) {
            arrayOfMatakuliah[i]=new MataKuliah08();
            System.out.print("Masukkan Data Matakuliah ke-" + (i+1));
            sc.nextLine();
            System.out.print("Kode           : ");
            arrayOfMatakuliah[i].kode=sc.nextLine();
           
            System.out.print("Nama           : ");
            arrayOfMatakuliah[i].nama = sc.nextLine();
           
            System.out.print("SKS            : ");
            arrayOfMatakuliah[i].sks = sc.nextInt();
            
            System.out.print("Jumlah jam     : ");
            arrayOfMatakuliah[i].jumlahJam = sc.nextInt();
       
            System.out.println("-----------------------------------------------");

            // arrayOfMatakuliah[i] = new MataKuliah08(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah[i].tambahData(arrayOfMatakuliah[i].kode, arrayOfMatakuliah[i].nama, arrayOfMatakuliah[i].sks, arrayOfMatakuliah[i].jumlahJam);
        }


        for (int i=0; i < jmlMatkul; i++) {
            System.out.println("Data mata kuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
