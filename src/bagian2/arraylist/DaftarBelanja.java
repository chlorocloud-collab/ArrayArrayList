package bagian2.arraylist;

import java.util.ArrayList;

public class DaftarBelanja {
    public static void main(String[] args) {
        // 1. Membuat ArrayList untuk daftar belanja
        ArrayList<String> daftarBelanja = new ArrayList<>();

        // 2. Tambah 4 item
        daftarBelanja.add("Apel");
        daftarBelanja.add("Roti");
        daftarBelanja.add("Susu");
        daftarBelanja.add("Telur");

        System.out.println("Daftar awal: " + daftarBelanja);

        // 3. Hapus item ke-2 (indeks 1, karena indeks dimulai dari 0)
        daftarBelanja.remove(1);

        // 4. Tampilkan isi list dan jumlah akhirnya
        System.out.println("Setelah hapus item ke-2: " + daftarBelanja);
        System.out.println("Jumlah item akhir: " + daftarBelanja.size());
    }
}
