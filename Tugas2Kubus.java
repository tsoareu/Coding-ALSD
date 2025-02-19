import java.util.Scanner;

public class Tugas2Kubus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int pilihan, sisi, luasPermukaan, volume, keliling;

    System.out.println("===== MENU =====");
    System.out.println("1. Hitung volume kubus");
    System.out.println("2. Hitung luas permukaan kubus");
    System.out.println("3. Hitung keliling kubus");
    System.out.print("Masukkan pilihan anda : ");
    pilihan = sc.nextInt();

    if (pilihan == 1) {
        System.out.print("Masukkan nilai sisi = ");
        sisi = sc.nextInt();
        volume = sisi * sisi * sisi;
        System.out.println("Nilai volume kubus adalah = " + volume);
    }
    else if(pilihan == 2) {
        System.out.print("Masukkan nilai sisi = ");
        sisi = sc.nextInt();
        luasPermukaan = 6 * (sisi * sisi);
        System.out.println("Nilai luas permukaan kubus adalah = " + luasPermukaan);
    }
    else if(pilihan == 3) {
        System.out.print("Masukkan nilai sisi = ");
        sisi = sc.nextInt();
        keliling = 12 * sisi;
        System.out.println("Nilai keliling kubus adalah = " + keliling);
    }
    else {
        System.out.println("Input tidak valid! Masukkan angka 1 - 3");
    }
    sc.close();
    }
}
