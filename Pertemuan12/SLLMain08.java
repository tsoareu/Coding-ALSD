package Pertemuan12;

import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.println("Masukkan jumlah data mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("NIM : ");
            String NIM = sc.nextLine();
            System.out.println("Nama : ");
            String nama = sc.nextLine();
            System.out.println("Kelas : ");
            String kelas = sc.nextLine();
            System.out.println("IPK : ");
            double ipk = sc.nextDouble();

            Mahasiswa08 mhs = new Mahasiswa08(nama, NIM, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("Dataa mahasiswa dalam antrian : ");
        sll.print();
    }
}

