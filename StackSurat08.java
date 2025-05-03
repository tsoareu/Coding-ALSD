package Jobsheet09;

import java.util.ArrayList;

public class StackSurat08 {
    private ArrayList stack;

    public StackSurat08() {
        this.stack = new ArrayList();
    }

    public void push(Surat08 surat) {
        this.stack.add(surat);
        System.out.println("Surat dengan ID " + surat.idSurat + " telah ditambahkan ke stack. ");
    }

    public Surat08 pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong! Tidak dapat melakukan pop.");
            return null;
        }
        return (Surat08) stack.remove(stack.size() - 1); 
    }

    public Surat08 peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong! Tidak ada elemen untuk di-peek.");
            return null;
        }
        return (Surat08) stack.get(stack.size() - 1);
    }

    public void terimaSurat(Surat08 surat) {
        push(surat);
    }

    public Surat08 prosesSurat() {
        return pop();
    }

    public Surat08 lihatSuratTerakhir() {
        return peek();
    }

    public Surat08 cariSurat(String namaMahasiswa) {
        for (Object obj : stack) {
            Surat08 surat = (Surat08) obj; 
            if (surat.namaMahasiswa.equals(namaMahasiswa)) {
                return surat;
            }
        }
        return null;
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
