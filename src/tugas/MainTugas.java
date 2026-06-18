package tugas;

/* * Nama: [Muhammad Rizqy Najamuddin]
 * NPM: [2410010386]
 */
public class MainTugas {
    public static void main(String[] args) {
        KelasKuliah kelas = new KelasKuliah();

        // 4. Array String untuk mata kuliah
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        System.out.println("Mata Kuliah:");
        for (String mk : mataKuliah) {
            System.out.println("* " + mk);
        }
        System.out.println();

        // Menambah 5 objek Mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Jotaro", "101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Joseph", "102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Kakyoin", "103", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Polnareff", "104", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Avdol", "105", 70.0));

        // 5. Menampilkan hasil
        kelas.tampilkanSemua();
        System.out.println("\nRata-rata Nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());

        // 6. Tambah satu mahasiswa baru
        System.out.println("\nMenambahkan mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "106", 65.0));
        System.out.println("Jumlah mahasiswa saat ini: " + kelas.getJumlahMahasiswa());
    }
}