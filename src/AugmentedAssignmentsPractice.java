public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Augmented Assignments
         *
         * Instruksi: Lengkapi semua tugas latihan di bawah ini untuk berlatih
         * operator augmented assignment dan memahami efisiensinya.
         */

        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

        // Latihan 1: Berlatih semua operator augmented assignment
        // - Deklarasikan variabel 'score' dengan nilai awal 100
        int score = 100;

        // - Gunakan += untuk menambah 25 ke score, lalu print hasilnya
        score += 25;
        System.out.println("Score setelah += 25: " + score);

        // - Gunakan -= untuk mengurangi 15 dari score, lalu print hasilnya
        score -= 15;
        System.out.println("Score setelah -= 15: " + score);

        // - Gunakan *= untuk mengalikan score dengan 2, lalu print hasilnya
        score *= 2;
        System.out.println("Score setelah *= 2: " + score);

        // - Gunakan /= untuk membagi score dengan 4, lalu print hasilnya
        score /= 4;
        System.out.println("Score setelah /= 4: " + score);

        // - Gunakan %= untuk mendapat sisa bagi ketika score dibagi 10, lalu print hasilnya
        score %= 10;
        System.out.println("Score setelah %= 10: " + score);

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        // Latihan 2: Bandingkan augmented assignments dengan regular assignments
        // - Buat dua variabel identik 'value1' dan 'value2' dengan nilai 50
        int value1 = 50;
        int value2 = 50;

        // - Untuk value1, gunakan regular assignment: value1 = value1 + 30
        value1 = value1 + 30;

        // - Untuk value2, gunakan augmented assignment: value2 += 30
        value2 += 30;

        // - Print kedua nilai untuk memastikan keduanya sama
        System.out.println("value1 = " + value1 + ", value2 = " + value2);

        // - Reset kedua nilai ke 80
        value1 = 80;
        value2 = 80;

        // - Untuk value1, gunakan regular assignment: value1 = value1 * 3
        value1 = value1 * 3;

        // - Untuk value2, gunakan augmented assignment: value2 *= 3
        value2 *= 3;

        // - Print kedua nilai untuk memastikan keduanya sama
        System.out.println("value1 = " + value1 + ", value2 = " + value2);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 3: Gunakan augmented assignments dalam skenario praktis
        // - Buat variabel 'bankBalance' dengan nilai awal 1000
        double bankBalance = 1000;

        // - Simulasikan deposit: tambahkan 250 ke bankBalance menggunakan +=
        bankBalance += 250;

        // - Simulasikan penarikan: kurangi 75 dari bankBalance menggunakan -=
        bankBalance -= 75;

        // - Simulasikan kalkulasi bunga: kalikan bankBalance dengan 1.05 (bunga 5%) menggunakan *=
        bankBalance *= 1.05;

        // - Print saldo akhir
        System.out.println("Saldo akhir bank: " + bankBalance);

        // Latihan 4: Pola counter dan accumulator
        // - Buat variabel 'totalSales' dimulai dari 0
        int totalSales = 0;

        // - Tambahkan jumlah penjualan harian menggunakan += : hari1 = 150, hari2 = 200, hari3 = 175
        totalSales += 150;
        totalSales += 200;
        totalSales += 175;

        // - Buat variabel 'productionCount' dimulai dari 1000
        double productionCount = 1000;

        // - Simulasikan barang cacat yang dihapus: kurangi 25 menggunakan -=
        productionCount -= 25;

        // - Simulasikan bonus produksi: kalikan dengan 1.1 menggunakan *=
        productionCount *= 1.1;

        // - Print kedua totalSales dan productionCount akhir
        System.out.println("Total sales: " + totalSales);
        System.out.println("Production count akhir: " + productionCount);

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\n=== TIPE DATA BERBEDA ===");

        // Latihan 5: Berlatih augmented assignments dengan berbagai tipe data
        // - Buat variabel double 'temperature' dengan nilai 20.5
        double temperature = 20.5;

        // - Gunakan += untuk menambah 5.7 ke temperature
        temperature += 5.7;

        // - Gunakan *= untuk mengalikan temperature dengan 1.8 (bagian dari konversi Celsius ke Fahrenheit)
        temperature *= 1.8;

        // - Gunakan += untuk menambah 32 (melengkapi konversi Celsius ke Fahrenheit)
        temperature += 32;

        // - Print suhu akhir dalam Fahrenheit
        System.out.println("Suhu dalam Fahrenheit: " + temperature);

        // Latihan 6: Penggabungan string dengan +=
        // - Buat variabel String 'message' dengan nilai "Hello"
        String message = "Hello";

        // - Gunakan += untuk menambah " World" ke message
        message += " World";

        // - Gunakan += untuk menambah "!" ke message
        message += "!";

        // - Print pesan akhir
        System.out.println("Pesan akhir: " + message);

        // Latihan 7: Tantangan - Hitung nilai majemuk
        // - Buat variabel 'investment' dengan nilai 5000
        double investment = 5000;

        // - Terapkan pertumbuhan majemuk 3 tahun pada 7% per tahun menggunakan *=
        // (Lakukan ini tiga kali: investment *= 1.07)
        investment *= 1.07;
        investment *= 1.07;
        investment *= 1.07;

        // - Print nilai investasi akhir
        System.out.println("Nilai investasi akhir: " + investment);

        // - Hitung berapa profit yang didapat (nilai akhir - 5000 awal)
        double profit = investment - 5000;
        System.out.println("Profit: " + profit);
    }
}
