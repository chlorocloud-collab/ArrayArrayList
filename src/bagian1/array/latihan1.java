/*
 * Apa itu Array?
 * Definisi: Array adalah wadah (variabel) yang bisa menyimpan banyak data sekaligus dalam satu nama variabel.
 * Syarat: Semua data di dalam satu array harus memiliki tipe data yang sama (misalnya: semuanya angka/int atau semuanya teks/String).
 * Ukuran Tetap: Sekali dibuat, jumlah kotak (elemen) di dalam array tidak bisa ditambah atau dikurangi lagi.
 */
package bagian1.array;

/* 
 * Properti .length memberi tahu jumlah elemen array. Indeks valid adalah
 * 0 sampai length-1. Mengakses nilai[5] pada array berukuran 5 akan
 * menimbulkan error ArrayIndexOutOfBoundsException.
 *
 */
public class latihan1 {
public static void main(String[] args) {
// Cara 1: deklarasi lalu isi per indeks
int[] nilai = new int[5];
nilai[0] = 80;
nilai[1] = 75;
nilai[2] = 90;
nilai[3] = 60;
nilai[4] = 85;
// Cara 2: langsung diisi saat dibuat
String[] nama = {"Andi", "Budi", "Citra"};
System.out.println("Nilai pertama : " + nilai[0]);
System.out.println("Nilai ketiga : " + nilai[2]);
System.out.println("Mahasiswa ke-2: " + nama[1]);
System.out.println("Jumlah nilai : " + nilai.length);
}
}