package TugasJS11;

public class NodeLayanan08 {
    AntriLayanan08 data;
    NodeLayanan08 next;

    public NodeLayanan08(AntriLayanan08 data, NodeLayanan08 next) {
        this.data = data;
        this.next = next;
    }

    public NodeLayanan08(AntriLayanan08 mahasiswa) {
        this.data = mahasiswa;
        this.next = null;
    }
}

