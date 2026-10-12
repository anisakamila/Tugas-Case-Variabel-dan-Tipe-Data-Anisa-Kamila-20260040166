
public class NilaiAkhirOutput {

    public static void main(String[] args) {
        
        String nama = "Siti";
        String prodi = "Sistem Informasi";
        String nim = "2024001";
        int nilai_tugas = 85;
        int nilai_uts = 78;
        int nilai_uas = 90;

        double nilai_akhir = (nilai_tugas * 0.30) + (nilai_uts * 0.30) + (nilai_uas * 0.40);

        System.out.println(" Transkip Nilai Mahasiswa ");
        System.out.println("--------------------------");
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
        System.out.println("NIM     : " + nim);
        System.out.println("--------------------------");
        System.out.println("Data Nilai");
        System.out.println("--------------------------");
        System.out.println("Daftar Penilaian | Nilai");
        System.out.println("Nilai Tugas      | " + nilai_tugas);
        System.out.println("Nilai UTS        | " + nilai_uts);
        System.out.println("Nilai UAS        | " + nilai_uas);
        System.out.println("Nilai Akhir      | " + nilai_akhir);

    }

}
