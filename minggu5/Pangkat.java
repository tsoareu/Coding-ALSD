package minggu5;

public class Pangkat {
    int nilai, pangkat;

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int nilai, int pangkat) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int pangkatDC(int nilai, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else if (pangkat % 2 == 1) {
            return nilai * pangkatDC(nilai, pangkat - 1);
        } else {
            int hasil = pangkatDC(nilai, pangkat / 2);
            return hasil * hasil;
        }
    }
}

