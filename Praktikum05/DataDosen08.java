
package Praktikum05;

public class DataDosen08 {
    Dosen08[] listDosen;
    int idx = 0;

    public DataDosen08(int jml) {
        listDosen = new Dosen08[jml];
    }

    void tambah(Dosen08 d) {
        if(idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if(idx == 0) {
            System.out.println("Tidak ada data yang tercatat");
            return;
        }

        for (int i = 0; i < idx; i++) {
            listDosen[i].tampil();
        }
    }

    void sortAscending() {
        if (idx <= 1) {
            System.out.println("Data tidak cukup untuk diurutkan");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listDosen[j].usia > listDosen[j + 1].usia) {
                    Dosen08 tmp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = tmp;
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 0; i < idx; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDosen[j].usia > listDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen08 tmp = listDosen[maxIdx];
            listDosen[maxIdx] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    void sequentialSearch(String cari) {
        int count = 0;
        int posisi = -1;

        for(int j=0; j<listDosen.length; j++) {
            if (listDosen[j].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) {
                    posisi = j;
                }
                count++;
            }
        }

        if (posisi != -1) {
            tampilDataSearchNama(cari, posisi);
            if (count > 1) {
                System.out.println("Peringatan: Ditemukan " + count + " data dengan nama " + cari);
            }
        } else {
            System.out.println("Data Dosen dengan nama " + cari + "tidak ditemukan");
        }
    }

    
    void tampilDataSearchNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + listDosen[pos].kode);
            System.out.println("Nama\t\t : " + x);
            System.out.println("Jenis kelamin\t : " + listDosen[pos].jenisKelamin);
            System.out.println("usia\t\t : " + listDosen[pos].usia);
        } else {
            System.out.println("Data Dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan usia : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data Dosen dengan usia " + x + " tidak ditemukan");
        }
    }


    void tampilDataSearch(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + listDosen[pos].kode);
            System.out.println("Nama\t\t : " + listDosen[pos].nama);
            System.out.println("Jenis kelamin\t : " + listDosen[pos].jenisKelamin);
            System.out.println("usia\t\t : " + x);
        } else {
            System.out.println("Data Dosen dengan usia " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            
            if (listDosen[mid].usia == cari) {
                return mid; 
            } else if (listDosen[mid].usia > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1; 
    }
    
    void findAndWarnBinarySearch(int cari, int left, int right) {
        int posisi = findBinarySearch(cari, left, right);
    
        if (posisi == -1) {
            System.out.println("Data Dosen dengan usia " + cari + " tidak ditemukan.");
            return;
        }
    
        int count = 1;
        
        int i = posisi - 1;
        while (i >= left && listDosen[i].usia == cari) {
            count++;
            i--;
        }
    
        int j = posisi + 1;
        while (j <= right && listDosen[j].usia == cari) {
            count++;
            j++;
        }
    
        tampilPosisi(cari, posisi);
        tampilDataSearch(cari, posisi);
    
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan " + count + " dosen dengan usia " + cari + ".");
        }
    }
    void checkSearchResults(String[] results) {
        int count = results.length;
        if (count > 1) {
            System.out.println("Peringatan! Ditemukan lebih dari satu hasil pencarian. Harap periksa kembali untuk memilih yang paling sesuai.");
        } else if (count == 1) {
            System.out.println("Ditemukan satu hasil pencarian: " + results[0]);
        } else {
            System.out.println("Tidak ada hasil yang sesuai dengan pencarian Anda.");
        }
    }
}