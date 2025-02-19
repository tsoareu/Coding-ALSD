import java.util.Scanner;

public class FungsiStock {
    static int aglonema = 75000;
    static int keladi = 50000;
    static int alocasia = 60000;
    static int mawar = 10000;

    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9} 
    };

    static int[] penguranganStock = {1, 2, 0, 5}; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Total stok masing-masing bunga di semua cabang RoyalGarden: ");

        pendapatanStockHabis();
        menampilkanStock();

        sc.close();
    }

    public static void pendapatanStockHabis() {
        for (int i = 0; i < stock.length; i++) {
            int total = (stock[i][0] * aglonema) + 
                        (stock[i][1] * keladi) + 
                        (stock[i][2] * alocasia) + 
                        (stock[i][3] * mawar);

            System.out.println("Total pendapatan RoyalGarden (jika bunga habis terjual) cabang " + (i + 1) + ": " + total);
        }
        System.out.println(" ");
    }

    public static void menampilkanStock() {
        System.out.println("Stok bunga di cabang ke-4 sebelum update:");
        System.out.println("Aglonema  : " + stock[3][0]);
        System.out.println("Keladi    : " + stock[3][1]);
        System.out.println("Alocasia  : " + stock[3][2]);
        System.out.println("Mawar     : " + stock[3][3]);

        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] -= penguranganStock[i];
        }
        System.out.println(" ");

        System.out.println("Stok bunga di cabang ke-4 setelah update:");
        System.out.println("Aglonema  : " + stock[3][0]);
        System.out.println("Keladi    : " + stock[3][1]);
        System.out.println("Alocasia  : " + stock[3][2]);
        System.out.println("Mawar     : " + stock[3][3]);
    }
}
