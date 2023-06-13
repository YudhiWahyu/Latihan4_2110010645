package penilian;

public class NilaiAkhir extends Mahasiswa {

    private int uts, uas, tugas;

    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        super(nama, npm);
        this.tugas = tugas;
        this.uas = uas;
        this.uts = uts;
    }

    public double hitungNilaiAkhir() {
        return (0.3 * uts) + (0.3 * uas) + (0.4 * tugas);
    }
}
