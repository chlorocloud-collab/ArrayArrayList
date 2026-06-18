package bagian1.array;

public class NamaHari {
    public static void main(String[] args) {
        // 1. Membuat array String berisi 5 nama hari
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("Nama hari dengan lebih dari 5 huruf:");

        // 2. Menggunakan for-each untuk memeriksa setiap nama
        for (String h : hari) {
            // 3. Cek panjang string menggunakan .length()
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
    }
}