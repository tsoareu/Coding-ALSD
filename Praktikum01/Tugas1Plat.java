import java.util.Scanner;

public class Tugas1Plat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N', '\0'}, 
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', '\0'},  
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', '\0'},  
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', '\0'},
            {'B', 'O', 'G', 'O', 'R', '\0'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', '\0'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', '\0'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', '\0'},
            {'M', 'A', 'L', 'A', 'N', 'G', '\0'},
            {'T', 'E', 'G', 'A', 'L', '\0'}
        };
        System.out.print("Input kode plat yang ingin anda cari: ");
        char input = Character.toUpperCase(sc.next().charAt(0));
        
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                ditemukan = true;
                System.out.print("Nama kota: ");
                for (char huruf : kota[i]) {
                    System.out.print(huruf);
                }
                System.out.println();
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

    }
}
