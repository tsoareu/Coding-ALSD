import java.util.Scanner;

public class HitungIps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 1, 2};  

        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobot = new double[matkul.length];

        System.out.println("==============================");
        System.out.println("Program Penghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka pada " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] >= 55) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            }
        }

        double totalNilai = 0;
        int totalSKS = 0;
        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        for (int j = 0; j < matkul.length; j++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f%n", matkul[j], nilaiAngka[j], nilaiHuruf[j], bobot[j]);

            totalNilai += bobot[j] * sks[j];  
            totalSKS += sks[j];  
        }

        System.out.println("==============================");

        double ipSemester = totalNilai / totalSKS;
        System.out.printf("\nIP Semester : %.2f\n", ipSemester);

        sc.close();
    }
}


