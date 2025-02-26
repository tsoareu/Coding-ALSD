import java.util.Scanner;

public class Latihantiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int mataKuliah = sc.nextInt();

        System.out.println(" ");
        
        int[][] nilaiMahasiswa = new int[mahasiswa][mataKuliah];
        
        for (int i = 0; i < mahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1));
            for (int j = 0; j < mataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }   
        }
        sc.close();
    }
    public static double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }
    for (i = 0; i < mahasiswa; i++) {
        double rataRata = hitungRataRata(nilaiMahasiswa[i]);
        String status = tentukanKelulusan(rataRata);
        System.out.println("Mahasiswa ke-" + (i + 1));
        System.out.println("Rata - rata = " + rataRata);
        System.out.println("Status = " + status);
    }
    
    public static String tentukanKelulusan(double rataRata) {
        return (rataRata >= 75) ? "Lulus" : "Tidak Lulus";
    }
}


