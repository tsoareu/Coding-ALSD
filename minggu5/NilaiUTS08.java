package minggu5;

public class NilaiUTS08 {
    public static int UTSMaks(Mahasiswa08[] mhs, int l, int r) {
        if (l == r) {
            return mhs[1].nilaiUTS;
        }
        int mid = (l+r)/2;
        int leftmaks = UTSMaks(mhs, l, mid);
        int rightMaks = UTSMaks(mhs, mid + 1, r);
        return Math.max(leftmaks, rightMaks);
    }
    public static int UTSmin(Mahasiswa08[] mhs, int l, int r) {
        if (l==r) {
            return mhs[1].nilaiUTS;
        }
        int mid = (l+r)/2;
        int leftmin = UTSmin(mhs, l, mid);
        int rightmin = UTSmin(mhs, mid + 1, r);
        return Math.min(leftmin, rightmin);
    }
}
