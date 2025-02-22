public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Siti Rahmawati";
        dosen1.bidangKeahlian = "Machine Learning";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.tampilInformasi();

        dosen1.ubahKeahlian("Artificial Intelligence");
        dosen1.tampilInformasi();
        
        Dosen06 dosen2 = new Dosen06("D002", "Prof. Budi Santoso", "Cyber Security", true, 2015);
        dosen2.tampilInformasi();
        
        Dosen06 dosen3 = new Dosen06("D003", "Dr. Indah Permata", "Data Science", false, 2018);
        dosen3.tampilInformasi();

        dosen3.setStatusAktif(true);
        dosen3.tampilInformasi();

        int tahunSekarang = 2025;
        System.out.println(dosen1.nama + " memiliki masa kerja " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println(dosen2.nama + " memiliki masa kerja " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println(dosen3.nama + " memiliki masa kerja " + dosen3.hitungMasaKerja(tahunSekarang) + " tahun.");
    }
}
