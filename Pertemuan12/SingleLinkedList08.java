package Pertemuan12;

public class SingleLinkedList08 {
    NodeMahasiswa08 head;
    NodeMahasiswa08 tail;

    boolean IsEmpty() {
        return (head == null);
    }

    public void tambahData(Mahasiswa08 mahasiswa) {
        NodeMahasiswa08 newNode = new NodeMahasiswa08(mahasiswa);
        if (head == null) {
            head = newNode;
        } else {
            NodeMahasiswa08 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Mahasiswa yang ditambahkan: " + mahasiswa);
        print();
    }

    public void print() {
    System.out.println("Isi Linked List:");
    if (IsEmpty()) {
        System.out.println("Linked list kosong");
        return;
    }
    NodeMahasiswa08 current = head;
    while (current != null) {
        System.out.println(current.data.nama + "\t" +
                           current.data.nim + "\t\t" +
                           current.data.kodeKelas + "\t" +
                           current.data.ipk);
        current = current.next;
    }
    System.out.println();
}

    public void addFirst(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        NodeMahasiswa08 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa08 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa08(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void tambahDataAwal(Mahasiswa08 mahasiswa) {
        NodeMahasiswa08 newNode = new NodeMahasiswa08(mahasiswa);
        newNode.next = head;
        head = newNode;
    }

    public String getData(int index) {
    NodeMahasiswa08 tmp = head;
    for (int i = 0; i < index; i++) {
    tmp = tmp.next;
    }
    return tmp.data.tampilInformasi();
    }

    public Mahasiswa08 aksesElemen(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return null;
        }
        NodeMahasiswa08 current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        System.out.println("Indeks di luar batas linked list.");
        return null;
    }

    public int indexOf(String key) {
        NodeMahasiswa08 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (IsEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (IsEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa08 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (IsEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa08 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}


