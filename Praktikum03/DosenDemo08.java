package Praktikum03;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jmlDosen;

        System.out.print("Masukkan jumlah dosen yang akan diinput : ");
        jmlDosen = sc.nextInt();
        sc.nextLine();
        Dosen08[] arrayOfDosen = new Dosen08[jmlDosen];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen08(null, null, null, i);

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin (P/W): ");
            char jenis = sc.nextLine().charAt(0);
            jenisKelamin = (jenis == 'P' || jenis == 'W'); 
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------");
            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }
        for (Dosen08 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
        DataDosen08 dataDosen = new DataDosen08();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}

