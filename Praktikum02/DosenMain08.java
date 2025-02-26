public class DosenMain08 {
    public static void main(String[] args) {

        System.out.println("==================");
        System.out.println("PROGRAM DATA DOSEN");
        System.out.println("==================");

        Dosen08 dosen1 = new Dosen08("245637899", "Kim Mingyu", true, 2022, "Arsitektur");
        dosen1.idDosen = "245637899";
        dosen1.nama = "Kim Mingyu";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2022;
        dosen1.bidangKeahlian = "Arsitektur";

        System.out.println();

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Matematika");

        System.out.println();
        System.out.println("Data Dosen setelah diupdate : ");
        dosen1.tampilInformasi();

        System.out.println();
        
        Dosen08 dosen2 = new Dosen08("245637999", "Drew Starkey", false, 1995, "Sejarah");
        dosen2.idDosen = "245637999";
        dosen2.nama = "Drew Starkey";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 1995;
        dosen2.bidangKeahlian = "Sejarah";

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Musik");
        
        System.out.println();
        System.out.println("Data Dosen setelah diupdate : ");
        dosen2.tampilInformasi();
        System.out.println();

        System.out.println("===============================================");
        System.out.println("TERIMA KASIH TELAH MENGAKSES PROGRAM DATA DOSEN");
        System.out.println("===============================================");
    }    
} 

