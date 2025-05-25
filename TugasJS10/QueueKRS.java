package TugasJS10;

class QueueKRS {
    String[] antrian;
    int front;
    int rear;
    int maxAntrian;
    int jumlahProses;

    public QueueKRS(int max) {
        maxAntrian = max;
        antrian = new String[maxAntrian];
        front = 0;
        rear = -1;
        jumlahProses = 0;
    }

    public boolean IsFull() {
        return rear == maxAntrian - 1;
    }

    public boolean IsEmpty() {
        return rear == -1;
    }

    public void clearAntrian() {
        front = 0;
        rear = -1;
        jumlahProses = 0;
        System.out.println("Antrian KRS telah dikosongkan.");
    }

    public void menambahAntrian(String dataMhs) {
        if (IsFull()) {
            System.out.println("Antrian KRS penuh. Mahasiswa tidak dapat ditambahkan.");
        } else {
            rear++;
            antrian[rear] = dataMhs;
            String[] parts = dataMhs.split(", ");
            System.out.println("Mahasiswa " + parts[1] + " berhasil masuk antrian KRS.");
        }
    }

    
    public String[] hapusAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong. Tidak ada mahasiswa untuk diproses.");
            return null;
        }
        String[] diprosesArr = new String[2];
        int jmlDiproses = 0;
        System.out.println("Memproses mahasiswa dari antrian:");

        if (!IsEmpty()) {
            diprosesArr[jmlDiproses++] = antrian[front++];
            System.out.println("Memproses: " + diprosesArr[0]);
        }
        if (!IsEmpty() && jmlDiproses < 2) {
            diprosesArr[jmlDiproses++] = antrian[front++];
            System.out.println("Memproses: " + diprosesArr[1]);
        }
        jumlahProses += jmlDiproses;

        int sisa = getJumlahAntrian();
        for (int i = 0; i < sisa; i++) {
            antrian[i] = antrian[i + (front - jmlDiproses)];
        }
        rear -= (front - jmlDiproses);
        front = 0;

        String[] hasil = new String[jmlDiproses];
        for (int i = 0; i < jmlDiproses; i++) {
            hasil[i] = diprosesArr[i];
        }
        return hasil;
    }

    public String[] AntrianDepan() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return null;
        } else {
            int jumlahPeek = Math.min(2, getJumlahAntrian());
            String[] duaDepan = new String[jumlahPeek];
            System.out.println("Dua antrian terdepan:");
            for (int i = 0; i < jumlahPeek; i++) {
                duaDepan[i] = antrian[i];
                System.out.println(antrian[i]);
            }
            return duaDepan;
        }
    }

    public String AntrianAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return null;
        } else {
            System.out.println("Antrian paling akhir:");
            System.out.println(antrian[rear]);
            return antrian[rear];
        }
    }

    public void layananKRS() {
        String[] diproses = hapusAntrian();
        if (diproses != null) {
            System.out.println("Proses layanan KRS selesai untuk:");
            for (String data : diproses) {
                System.out.println(data);
                System.out.println("---");
            }
        }
    }

    public void tampilkanAntrian() {
        if (rear == -1) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("Antrian KRS: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print((i + 1) + ". ");
                if (antrian[i] != null) {
                    System.out.println(antrian[i]);
                } else {
                    System.out.println("Slot antrian kosong");
                }
            }
        }
    }

    public int getJumlahAntrian() {
        return rear + 1;
    }

    public int getJumlahProses() {
        return jumlahProses;
    }

    public int getJumlahBelumProses() {
        return getJumlahAntrian() - getJumlahProses();
    }
}

