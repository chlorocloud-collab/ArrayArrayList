package bagian2.arraylist;

import java.util.ArrayList;

public class CariNilaiTerbesar {
    public static void main(String[] args) {
        // 1. Membuat ArrayList untuk menampung Integer
        ArrayList<Integer> angka = new ArrayList<>();

        // 2. Menambahkan 5 angka
        angka.add(15);
        angka.add(42);
        angka.add(8);
        angka.add(90);
        angka.add(23);

        System.out.println("Data angka: " + angka);

        // 3. Mencari nilai terbesar dengan menelusuri elemen
        // Kita asumsikan elemen pertama adalah yang terbesar sebagai titik awal
        int max = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > max) {
                max = angka.get(i);
            }
        }

        // 4. Menampilkan hasil
        System.out.println("Nilai terbesar adalah: " + max);
    }
}