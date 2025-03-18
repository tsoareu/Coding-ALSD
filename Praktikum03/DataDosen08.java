package Praktikum03;

public class DataDosen08 {
    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        System.out.println("===========================");
        System.out.println("     DATA DOSEN 2025");
        System.out.println("===========================");
        for (Dosen08 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        System.out.println("===========================");
        System.out.println("     DATA DOSEN 2025");
        System.out.println("(berdasarkan jenis kelamin)");
        System.out.println("===========================");

        int hitungWanita = 0;
        int hitungPria = 0;

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                hitungWanita++;
            } else { 
                hitungPria++;
            }
        }

        System.out.println("Jumlah Dosen Wanita : " + hitungWanita);
        System.out.println("Jumlah Dosen Pria   : " + hitungPria);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        System.out.println("========================================");
        System.out.println("Rata-rata usia dosen (per jenis kelamin Wanita/Pria) : ");

        int totalUsiaPria = 0;
        int hitungPria = 0;
        int totalUsiaWanita = 0;
        int hitungWanita = 0;

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                totalUsiaPria += dosen.usia;
                hitungPria++;
            } else { 
                totalUsiaWanita += dosen.usia;
                hitungWanita++;
            }
        }

        if (hitungWanita > 0) {
            System.out.println("Rata-rata usia dosen (Pria) : " + (totalUsiaPria / hitungPria));
        }
        if (hitungPria > 0) {
            System.out.println("Rata-rata usia dosen (Wanita) : " + (totalUsiaWanita / hitungWanita));
        }
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen08 tua = arrayOfDosen[0];

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > tua.usia) {
                tua = dosen;
            }
        }
        System.out.println("Dosen paling tua:");
        tua.tampilkanInfo();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen08 muda = arrayOfDosen[0];

        for (Dosen08 dosen : arrayOfDosen) {
            muda = dosen;
            if (dosen.usia < muda.usia) {
                muda = dosen;
            }
        }
        System.out.println("Dosen paling muda:");
        muda.tampilkanInfo();
    }
}


