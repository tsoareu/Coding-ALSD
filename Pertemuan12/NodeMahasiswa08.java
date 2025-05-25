package Pertemuan12;

public class NodeMahasiswa08 {
    Mahasiswa08 data;
    NodeMahasiswa08 next;

    public NodeMahasiswa08(Mahasiswa08 data, NodeMahasiswa08 next) {
        this.data = data;
        this.next = next;
    }

    public NodeMahasiswa08(Mahasiswa08 mahasiswa) {
        this.data = mahasiswa; 
        this.next = null;
    }
}
