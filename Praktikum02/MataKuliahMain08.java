
public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08("A","ALSD", 2,2);
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.kurangJam(0);
        System.out.println();
        System.out.println("Data mata kuliah setelah diupdate :");
        mk1.tampilInformasi();

        System.out.println();
        
        MataKuliah08 mk2 = new MataKuliah08("C","BASIS DATA", 2,1);
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(0);
        mk2.kurangJam(1);
        System.out.println();
        System.out.println("Data mata kuliah setelah diupdate :");
        mk2.tampilInformasi();
    }
}
