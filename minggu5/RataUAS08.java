package minggu5;

public class RataUAS08 {
    public static double rataUAS(Mahasiswa08[] mhs) {
        double total = 0;
        for (Mahasiswa08 mahasiswa : mhs) {
            total += mahasiswa.nilaiUAS;
        }
        return total/mhs.length;
    }
    
}
