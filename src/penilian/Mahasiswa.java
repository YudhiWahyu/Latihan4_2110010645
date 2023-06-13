package penilian;

public class Mahasiswa {
private String nama, npm;

public Mahasiswa (String nama, String npm) {
    this.nama = nama;
    this.npm = npm;
}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }


}
