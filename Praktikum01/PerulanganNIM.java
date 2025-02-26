import java.util.Scanner;

public class PerulanganNIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        long NIM = sc.nextLong();

        int lastDigit = (int) (NIM % 10);
        int n = lastDigit + 10;

        if (n < 10) {
            n += 10;
        }

        System.out.println("===========================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
