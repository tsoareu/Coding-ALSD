package TugasJS10;

class AntriKRS {
    String[] antrian;
    int maxAntrian;

    public AntriKRS(int max) {
        maxAntrian = max;
        antrian = new String[maxAntrian];
    }

    public void tampilkanAntrian(int front, int rear) {
        if (rear == -1) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("Tambah antrian KRS:");
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
}