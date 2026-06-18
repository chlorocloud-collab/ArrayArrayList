/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author Hype
 */
public class HitungGenap {
    public static void main(String[] args) {
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        // Loop untuk mengecek setiap angka
        for (int a : angka) {
            // Jika angka dibagi 2 sisa 0, berarti genap
            if (a % 2 == 0) {
                jumlahGenap++; // Tambahkan 1 ke counter
            }
        }

        System.out.println("Jumlah angka genap: " + jumlahGenap);
    }
}
