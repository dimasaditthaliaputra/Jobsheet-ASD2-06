public class Dosen06 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen06() {

    }

    public Dosen06(String idDosen, String nama, String bidangKeahlian, boolean status, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        statusAktif = status;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilInformasi() {
        System.out.println("\n=== Informasi Dosen ===");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("=============================");
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println(
                "Status aktif dosen " + nama + " telah diubah menjadi " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + nama + " telah diubah menjadi " + bidangKeahlian);
    }
}
