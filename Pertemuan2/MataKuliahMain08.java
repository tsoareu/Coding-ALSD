
public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMK = "A";
        mk1.nama = "ALSD";
        mk1.sks = 2;
        mk1.jumlahJam = 2;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.kurangJam(0);

        System.out.println();
        
        MataKuliah08 mk2 = new MataKuliah08(); 
        mk2.kodeMK = "C";
        mk2.nama = "BASIS DATA";
        mk2.sks = 2;
        mk2.jumlahJam = 1;

        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(0);
        mk2.kurangJam(1);
        
    }
    
}
