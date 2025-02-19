public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(5.00);

        System.out.println();

        Mahasiswa08 mhs2 = new Mahasiswa08("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(3.20);
        mhs2.tampilkanInformasi();

        System.out.println();
        
        Mahasiswa08 mhsMingyu = new Mahasiswa08("Mingyu","2437580950", 3.25,"TI 2K");
        mhsMingyu.updateIpk(3.50);
        mhsMingyu.tampilkanInformasi();
    }
}
