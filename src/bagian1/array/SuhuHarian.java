
package bagian1.array;


public class SuhuHarian {
    public static void main(String[] args) {
        // 1. Membuat array berisi 6 suhu
        double[] suhu = {27.3, 28.5, 29.7, 30.9, 31.1, 32.3};

        // 2. Inisialisasi variabel untuk perbandingan
        double max = suhu[0];
        double min = suhu[0];

        // 3. Loop untuk mencari nilai tertinggi dan terendah
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > max) {
                max = suhu[i];
            }
            if (suhu[i] < min) {
                min = suhu[i];
            }
        }

        // 4. Menampilkan hasil
        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah: " + min);
    }
}