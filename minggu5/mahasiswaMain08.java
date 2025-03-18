package minggu5;

public class mahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08[] mhs = new Mahasiswa08[] {
            new Mahasiswa08("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa08("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa08("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa08("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa08("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa08("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa08("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa08("Hadi", "220101008", 2020, 82, 84)
        };

        int UTSMaks = NilaiUTS08.UTSMaks(mhs, 0, mhs.length - 1);
        System.out.println("Nilai UTS tertinggi: " + UTSMaks);

        int UTSmin = NilaiUTS08.UTSmin(mhs, 0, mhs.length - 1);
        System.out.println("Nilai UTS terendah: " + UTSmin);

        double rataUAS = RataUAS08.rataUAS(mhs);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
    
}
