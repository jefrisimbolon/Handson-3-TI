public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int penjumlahan = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int pengurangan = num1 - num2;

        // - Hitung dan simpan hasil perkalian num1 dan num2
        int perkalian = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int pembagianInt = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int modulus = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("=== LANGKAH PERHITUNGAN ARITMATIKA ===");
        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + penjumlahan);
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + pengurangan);
        System.out.println("Perkalian: " + num1 + " * " + num2 + " = " + perkalian);
        System.out.println("Pembagian (integer): " + num1 + " / " + num2 + " = " + pembagianInt);
        System.out.println("Sisa bagi (modulus): " + num1 + " % " + num2 + " = " + modulus);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int divInt = 17 / 5;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double divFloat1 = 17.0 / 5;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        double divFloat2 = (double) 17 / 5;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("Pembagian integer 17/5 = " + divInt);
        System.out.println("Pembagian floating-point 17.0/5 = " + divFloat1);
        System.out.println("Pembagian dengan casting (double)17/5 = " + divFloat2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        double panjang = 12.5, lebar = 8.3;
        double luas = panjang * lebar;


        // - Hitung keliling persegi panjang yang sama
        double keliling = 2 * (panjang + lebar);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double pajak = 0.08;
        double totalHarga = jumlahBarang * hargaBarang * (1 + pajak);

        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int hari = 50;
        int minggu = hari / 7;
        int sisaHari = hari % 7;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("Luas: " + panjang + " * " + lebar + " = " + luas);
        System.out.println("Keliling: 2 * (" + panjang + " + " + lebar + ") = " + keliling);
        System.out.println("Total harga: " + jumlahBarang + " * " + hargaBarang + " * (1 + " + pajak + ") = " + String.format("$%.2f", totalHarga));
        System.out.println("Suhu: (" + celsius + " * 9/5) + 32 = " + fahrenheit + "°F");
        System.out.println("Hari: " + hari + " / 7 = " + minggu + " minggu, sisa " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;


        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double pokok = 1000;
        double sukuBunga = 0.05;
        int tahun = 3;
        double jumlah = pokok * Math.pow(1 + sukuBunga, tahun);

        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        int n1 = 85, n2 = 92, n3 = 78, n4 = 96, n5 = 88;
        double rataRata = (n1 + n2 + n3 + n4 + n5) / 5.0;

        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
        System.out.println("Jarak: " + kecepatan + " * " + waktu + " = " + jarak + " km");
        System.out.println("Bunga majemuk: " + pokok + " * (1 + " + sukuBunga + ")^" + tahun + " = " + String.format("%.2f", jumlah));
        System.out.println("Rata-rata nilai: " + jumlah + " / " + tahun + " = " + rataRata);


    }
}
