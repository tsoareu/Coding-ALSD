package Praktikum03;
import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa08[] arrayOfMahasiswa = new Mahasiswa08[3];

        for (int i=0; i < 3; i++) {
        arrayOfMahasiswa[i] = new Mahasiswa08();

        System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
        System.out.print("NIM     : ");
        arrayOfMahasiswa[i].nim = sc.nextLine();
        System.out.print("Nama    : ");
        arrayOfMahasiswa[i].nama = sc.nextLine();
        System.out.print("Kelas   : ");
        arrayOfMahasiswa[i].kelas = sc.nextLine();
        System.out.print("IPK     : ");
        arrayOfMahasiswa[i].ipk = sc.nextFloat();
        sc.nextLine();
        System.out.println("--------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
            System.out.println("-------------------------------");
        }
    }
}
