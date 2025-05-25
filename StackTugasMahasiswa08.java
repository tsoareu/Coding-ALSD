package Jobsheet09;

public class StackTugasMahasiswa08 {
    Mahasiswa08[] stack;
    int top, size;

    public StackTugasMahasiswa08(int size) {
        this.size = size;
        stack = new Mahasiswa08[size];
        top = -1;
    }
        public boolean isFull() {
            return top == size - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(Mahasiswa08 mhs) {
            if (!isFull() == true) {
                top++;
                stack[top] = mhs;
            } else {
                System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
            }
        }        

        public Mahasiswa08 pop() {
            if (isEmpty() == false) {
                Mahasiswa08 m = stack[top];
                stack[top] = null;
                top--;
                return m;
            } else {
                System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
                return null;
            }
        }
        
        public Mahasiswa08 peek() {
            if (isEmpty() == false) {
                return stack[top];
            } else {
                System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
                return null;
            }
        }

        public void print() {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        }

        public String konversiDesimalkeBiner(int nilai) {
            StackKonversi stack = new StackKonversi();
            while (nilai > 0) {
                int sisa = nilai % 2;
                stack.push(sisa);
                nilai = nilai/2;
            }
            String biner = new String();
            while (!stack.isEmpty()) {
                biner += stack.pop();
            }
            return biner;
        }

        public int jumlahTugas() {
            return top + 1;
        }
        
        public Mahasiswa08 tugasPertama() {
            if (isEmpty()) {
                System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
                return null;
            } else {
                return stack[0];
            }
        }
    }