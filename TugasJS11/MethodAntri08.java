package TugasJS11;

public class MethodAntri08 {
    NodeLayanan08 head;
    NodeLayanan08 tail;
    int size;
    int slotAntri; 

    public MethodAntri08(int slotAntri) {
        head = null;
        tail = null;
        size = 0;
        this.slotAntri = slotAntri;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public boolean isFull() {
        return size >= slotAntri;
    }

    public int size() {
        return size;
    }

    public void enqueue(AntriLayanan08 mahasiswa) {
    if (isFull()) {
        System.out.println("Maaf, antrian sudah penuh.");
        return;
    }
    NodeLayanan08 newNode = new NodeLayanan08(mahasiswa);
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
    size++;
    System.out.println("Atas nama " + mahasiswa.nama + " berhasil masuk antrian.");
    System.out.println("");
}

public AntriLayanan08 dequeue() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return null;
    }
    NodeLayanan08 temp = head;
    head = head.next;
    if (head == null) {
        tail = null;
    }
    size--;
    AntriLayanan08 mhsKeluar = temp.data;
    System.out.println("Memanggil atas nama " + mhsKeluar.nama + " dengan NIM " + mhsKeluar.nim);
    return mhsKeluar;
}

    public AntriLayanan08 peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return head.data;
    }

    public AntriLayanan08 peekLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return tail.data;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void printAntrian() {
    System.out.println("");
    System.out.println("Daftar Antrian:");
    System.out.println("No.\tNama\t\tNIM\t\tProdi\t\tKeterangan");
    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return;
    }
    NodeLayanan08 current = head;
    int nomorAntrian = 1;
    while (current != null) {
        System.out.println(nomorAntrian + ".\t" + current.data.nama + "\t\t"
                + current.data.nim + "\t\t" + current.data.prodi + "\t\t" + current.data.keterangan);
        current = current.next;
        nomorAntrian++;
    }
    System.out.println();
}
}