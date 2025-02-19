public class RoyalGarden14 {

    // Harga setiap jenis bunga
    static final int AGLONEMA_PRICE = 75000;
    static final int KELADI_PRICE = 50000;
    static final int ALOCASIA_PRICE = 60000;
    static final int MAWAR_PRICE = 10000;

    // Data stock bunga pada setiap cabang
    static int[][] stock = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    // Fungsi untuk menghitung pendapatan berdasarkan stock
    public static void hitungPendapatan() {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = (stock[i][0] * AGLONEMA_PRICE) +
                             (stock[i][1] * KELADI_PRICE) +
                             (stock[i][2] * ALOCASIA_PRICE) +
                             (stock[i][3] * MAWAR_PRICE);
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": " + pendapatan);
        }
    }

    // Fungsi untuk mengetahui jumlah stock setiap jenis bunga
    public static void jumlahkanStock() {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;
        
        for (int i = 0; i < stock.length; i++) {
            totalAglonema += stock[i][0];
            totalKeladi += stock[i][1];
            totalAlocasia += stock[i][2];
            totalMawar += stock[i][3];
        }
        
        System.out.println("Total Stock Aglonema: " + totalAglonema);
        System.out.println("Total Stock Keladi: " + totalKeladi);
        System.out.println("Total Stock Alocasia: " + totalAlocasia);
        System.out.println("Total Stock Mawar: " + totalMawar);
    }

    // Fungsi untuk mengurangi stock berdasarkan bunga yang mati
    public static void updateStock(int aglonemaDead, int keladiDead, int alocasiaDead, int mawarDead) {
        for (int i = 0; i < stock.length; i++) {
            stock[i][0] -= aglonemaDead;
            stock[i][1] -= keladiDead;
            stock[i][2] -= alocasiaDead;
            stock[i][3] -= mawarDead;
        }

        System.out.println("Stock setelah pembaruan (bunga mati):");
        jumlahkanStock();
    }

    public static void main(String[] args) {
        // Menampilkan pendapatan setiap cabang
        hitungPendapatan();

        // Menampilkan total stock bunga pada semua cabang
        jumlahkanStock();

        // Mengupdate stock bunga setelah beberapa bunga mati
        updateStock(1, 2, 0, 5);  // Aglonema -1, Keladi -2, Alocasia -0, Mawar -5
    }
}
