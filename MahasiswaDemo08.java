package Jobsheet09;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(2);
        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Jumlah Tugas yang Sudah Dikumpulkan");
            System.out.println("6. Melihat Tugas Terbawah");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch ((pilih)) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;
                case 6: 
                    Mahasiswa08 terbawah = stack.tugasPertama();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + terbawah.nama);
                    }
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while ((pilih >= 1 && pilih <= 6));    
    }
}
