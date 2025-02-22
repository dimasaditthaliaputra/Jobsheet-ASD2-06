public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 matkul1 = new MataKuliah06();
        matkul1.kodeMK = "SIB242004";
        matkul1.nama    = "Algoritma dan Struktur Data";
        matkul1.sks     = 2;
        matkul1.jumlahJam = 3;
        matkul1.tampilInformasi();

        matkul1.ubahSKS(3);
        matkul1.tambahJam(1);

        matkul1.tampilInformasi();

        MataKuliah06 matkul2 = new MataKuliah06("SIB242005", "Praktikum Algoritma dan Struktur Data", 2, 6);
        matkul2.kurangiJam(10);
        matkul2.tampilInformasi();

        MataKuliah06 matkul3 = new MataKuliah06("SIB242006", "Basis Data", 2, 6);
        matkul3.kurangiJam(3);
        matkul3.tampilInformasi();
    }
}
