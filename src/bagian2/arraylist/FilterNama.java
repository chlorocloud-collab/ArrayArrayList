/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class FilterNama {
    public static void main(String[] args) {
        // 1. Membuat ArrayList untuk menampung nama
        ArrayList<String> daftarNama = new ArrayList<>();

        // 2. Menambahkan 6 nama
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ahmad");
        daftarNama.add("Citra");
        daftarNama.add("Alya");
        daftarNama.add("Dedi");

        System.out.println("Daftar semua nama: " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");

        // 3. Menelusuri list dan mencetak nama yang diawali huruf 'A'
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}
